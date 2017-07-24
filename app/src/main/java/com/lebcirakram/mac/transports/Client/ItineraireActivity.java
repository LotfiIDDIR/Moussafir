package com.lebcirakram.mac.transports.Client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lebcirakram.mac.transports.R;

public class ItineraireActivity extends AppCompatActivity {


    ImageView chemain1,chemain2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraire);

        chemain1 = (ImageView) findViewById(R.id.chemain1);
        chemain2 = (ImageView) findViewById(R.id.chemain2);

        chemain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItineraireActivity.this,ItineraireDetailActivity.class);
                intent.putExtra("i",1);
                startActivity(intent);
            }
        });

        chemain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItineraireActivity.this,ItineraireDetailActivity.class);
                intent.putExtra("i",2);
                startActivity(intent);
            }
        });
    }
}
