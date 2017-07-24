package com.lebcirakram.mac.transports.Client.Fragment;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

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
import com.lebcirakram.mac.transports.Models.Fournisseur;
import com.lebcirakram.mac.transports.R;

import io.github.yavski.fabspeeddial.FabSpeedDial;


public class MapFragment extends Fragment implements OnMapReadyCallback {

    private SupportMapFragment myMAPF;
    private MapStyleOptions style;

    FabSpeedDial fab;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        style = MapStyleOptions.loadRawResourceStyle(getContext(), R.raw.mapstyle_retro);
        return inflater.inflate(R.layout.fragment_map, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fab = (FabSpeedDial) view.findViewById(R.id.fb_filter);
        //myMAPF = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map);
        myMAPF = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.fragment);
        myMAPF.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(36.724465, 3.195865), 10));

        googleMap.setMapStyle(style);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
                && getActivity().checkSelfPermission(
                Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && getActivity().checkSelfPermission(
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(
                    new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                            Manifest.permission.ACCESS_FINE_LOCATION},
                    1);
        }else {
            googleMap.setMyLocationEnabled(true);
        }

        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.724465, 3.195865)).title("Soumam Bis Bus Stop").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.740148, 3.111277)).title("Gare Routiere du Caroubier").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.764884, 3.059099)).title("Gare de Champs de Manoeuvre").icon(BitmapDescriptorFactory.fromResource(R.drawable.bus_small)));


        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.752694, 3.073973)).title("Akram"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757561, 3.056847)).title("Ala"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757385, 3.064971)).title("Ahmed"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.735578, 3.119803)).title("Alilo"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.741996, 3.100656)).title("Mouhamed"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.744694, 3.105926)).title("Ishak"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.751379, 3.077749)).title("Lotfi"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(36.747450, 3.071235)).title("Amir"));

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

        fab.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                googleMap.clear();
                int id = menuItem.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.bus) {
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.752694, 3.073973)).title("Akram"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.735578, 3.119803)).title("Alilo"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.751379, 3.077749)).title("Lotfi"));

                }else if (id == R.id.taxi){
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757561, 3.056847)).title("Ala"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.741996, 3.100656)).title("Mouhamed"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.747450, 3.071235)).title("Amir"));

                }else if (id == R.id.etusa){
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757385, 3.064971)).title("Ahmed"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.744694, 3.105926)).title("Ishak"));

                }else if (id == R.id.tout){
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.752694, 3.073973)).title("Akram"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757561, 3.056847)).title("Ala"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.757385, 3.064971)).title("Ahmed"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.735578, 3.119803)).title("Alilo"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.741996, 3.100656)).title("Mouhamed"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.744694, 3.105926)).title("Ishak"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.751379, 3.077749)).title("Lotfi"));
                    googleMap.addMarker(new MarkerOptions().position(new LatLng(36.747450, 3.071235)).title("Amir"));

                }
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

                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
