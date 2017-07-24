package com.lebcirakram.mac.transports.Fournisseur;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlacePicker;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.lebcirakram.mac.transports.MainActivity;
import com.lebcirakram.mac.transports.Models.Arret;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;

public class FournisseurDetailActivity extends AppCompatActivity {

    myAdapterDetail adapterDetail;
    ListView listView;
    ArrayList<Arret> arrayList;
    EditText nbrplace,nbrarret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fournisseur_detail);

        PlaceAutocompleteFragment autocompleteFragmentdepart = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment_depart);
        PlaceAutocompleteFragment autocompleteFragmentArrivee = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.autocomplete_fragment_arrivee);

        FloatingActionButton fbsave = (FloatingActionButton)findViewById(R.id.fbsave);

        nbrplace = (EditText) findViewById(R.id.idnbrplace);
        nbrarret = (EditText) findViewById(R.id.idnbrarret);

        listView = (ListView) findViewById(R.id.listinfoarret);
        arrayList = new ArrayList<Arret>();
        adapterDetail = new myAdapterDetail(arrayList,this);
        listView.setAdapter(adapterDetail);

        fbsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!depart.getText().toString().equals("") && !fin.getText().toString().equals("") && !nbrplace.getText().toString().equals("")){
                    Intent i = new Intent(FournisseurDetailActivity.this,FournisseurActivity.class);
                    startActivity(i);
               // }
            }
        });

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


        nbrarret.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!charSequence.toString().equals("")) {
                    try {
                        arrayList.clear();
                        for (int j = 0; j < Double.parseDouble(charSequence.toString()); j++) {
                            Arret r = new Arret(null,"",0,0.0);
                            arrayList.add(r);
                        }
                        adapterDetail.notifyDataSetChanged();
                    }catch (Exception e){}
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
