package com.lebcirakram.mac.transports.Fournisseur;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.lebcirakram.mac.transports.Models.Arret;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;

/**
 * Created by mac on 7/15/17.
 */

public class myAdapterclient extends BaseAdapter{
    ArrayList<Arret> arrayList;
    Context context;
    public myAdapterclient(ArrayList<Arret> list, Context context){
        this.arrayList = list;
        this.context = context;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.itemfournisseurclient, viewGroup, false);
        }
        TextView nomarret = view.findViewById(R.id.nomarret);
        TextView nbrclient = view.findViewById(R.id.nbrclient);
        ImageButton imgmaps = view.findViewById(R.id.imgmaps);

        nomarret.setText(arrayList.get(i).getNomArret().toString());
        nbrclient.setText(arrayList.get(i).getNbrClient()+" client");

        imgmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FournisseurMapActivity.class);
                intent.putExtra("p",i+10);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
