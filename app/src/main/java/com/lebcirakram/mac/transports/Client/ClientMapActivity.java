package com.lebcirakram.mac.transports.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.lebcirakram.mac.transports.R;

public class ClientMapActivity extends AppCompatActivity implements OnMapReadyCallback{


    private SupportMapFragment myMAPF;
    private MapStyleOptions style;
    int p;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_map);
        style = MapStyleOptions.loadRawResourceStyle(getApplicationContext(), R.raw.mapstyle_retro);

        myMAPF = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        myMAPF.getMapAsync(this);

        p = getIntent().getIntExtra("p",0);
        name = getIntent().getStringExtra("name");
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.740148, 3.111277), 10));

        googleMap.setMapStyle(style);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.724465, 3.195865)).title("Soumam Bis Bus Stop").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.740148, 3.111277)).title("Gare Routiere du Caroubier").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.764884, 3.059099)).title("Gare de Champs de Manoeuvre").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));

        PolylineOptions rectOptions = new PolylineOptions()
                .add(new LatLng(36.724465, 3.195865))//bab zeoire
                .add(new LatLng(36.725360, 3.194854))
                .add(new LatLng(36.726342, 3.186871))
                .add(new LatLng(36.725634, 3.177109))
                .add(new LatLng(36.723364, 3.156338))
                .add(new LatLng(36.729693, 3.137284))
                .add(new LatLng(36.731137, 3.127070))
                .add(new LatLng(36.734783, 3.121920))
                .add(new LatLng(36.737397, 3.115440))
                .add(new LatLng(36.740148, 3.111277))// hkarouba
                .add(new LatLng(36.743759, 3.103123))
                .add(new LatLng(36.746544, 3.092909))
                .add(new LatLng(36.752218, 3.075507))
                .add(new LatLng(36.756052, 3.067010))
                .add(new LatLng(36.762600, 3.059216))
                .add(new LatLng(36.764574, 3.058627))
                .add(new LatLng(36.764884, 3.059099));//hasiba;


// Get back the mutable Polyline
        Polyline polyline = googleMap.addPolyline(rectOptions);

        switch (p){
            case 0:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.752694, 3.073973)).title(name));
                break;
            case 1:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757561, 3.056847)).title(name));
                break;
            case 2:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757385, 3.064971)).title(name));
                break;
            case 3:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.735578, 3.119803)).title(name));
                break;
            case 4:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.741996, 3.100656)).title(name));
                break;
            case 5:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.744694, 3.105926)).title(name));
                break;
            case 6:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.751379, 3.077749)).title(name));
                break;
            default:
                googleMap.addMarker(new MarkerOptions().position(new LatLng(36.747450, 3.071235)).title(name));
                break;
        }
    }
}
