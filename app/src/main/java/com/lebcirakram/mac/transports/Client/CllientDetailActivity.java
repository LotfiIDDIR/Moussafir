package com.lebcirakram.mac.transports.Client;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.gigamole.library.PulseView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.lebcirakram.mac.transports.MapsActivity;
import com.lebcirakram.mac.transports.R;

public class CllientDetailActivity extends AppCompatActivity {

    PulseView pulseView;


    ImageButton b1 , b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cllient_detail);

        PlaceAutocompleteFragment autocompleteFragmentdepart = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment_depart);
        PlaceAutocompleteFragment autocompleteFragmentArrivee = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment_arrivee);

        autocompleteFragmentdepart.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
//                depart.setText(getResources()+ place.getName().toString()+ place.getId().toString()+
//                        place.getAddress().toString()+place.getPhoneNumber().toString()+ place.getWebsiteUri().toString());
//
//                CharSequence attributions = place.getAttributions();
//                if (!TextUtils.isEmpty(attributions)) {
//                    depart.setText(Html.fromHtml(attributions.toString()));
//                } else {
//                    depart.setText("");
//                }
            }

            @Override
            public void onError(Status status) {
//                depart.setText("");
                Toast.makeText(getApplicationContext(), "Place selection failed: " + status.getStatusMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        autocompleteFragmentArrivee.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
//                depart.setText(getResources()+ place.getName().toString()+ place.getId().toString()+
//                        place.getAddress().toString()+place.getPhoneNumber().toString()+ place.getWebsiteUri().toString());
//
//                CharSequence attributions = place.getAttributions();
//                if (!TextUtils.isEmpty(attributions)) {
//                    depart.setText(Html.fromHtml(attributions.toString()));
//                } else {
//                    depart.setText("");
//                }
            }

            @Override
            public void onError(Status status) {
                //depart.setText("");
                Toast.makeText(getApplicationContext(), "Place selection failed: " + status.getStatusMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        pulseView = (PulseView) findViewById(R.id.pv);
        b1 = (ImageButton) findViewById(R.id.imageButton3);
        b2 = (ImageButton) findViewById(R.id.imageButton4);
        pulseView.startPulse();

        pulseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent intent = new Intent(CllientDetailActivity.this, ClientActivity.class);
                pulseView.finishPulse();
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent intent = new Intent(CllientDetailActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent intent = new Intent(CllientDetailActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });


    }
}
