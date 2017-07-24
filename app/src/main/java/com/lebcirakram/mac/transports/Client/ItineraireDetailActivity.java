package com.lebcirakram.mac.transports.Client;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lebcirakram.mac.transports.R;

public class ItineraireDetailActivity extends AppCompatActivity {

    ImageView img1,img2;
    int i ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itineraire_detail);

        i=getIntent().getIntExtra("i",1);
        img1 = (ImageView)findViewById(R.id.imageView4);
        img2 = (ImageView)findViewById(R.id.imageView5);
        if (i == 1){
            img1.setImageResource(R.drawable.chemain1_1);
            img2.setVisibility(View.INVISIBLE);
        }else {
            img1.setImageResource(R.drawable.chemain2_1);
            img2.setImageResource(R.drawable.chemain2_2);
        }
    }
}
