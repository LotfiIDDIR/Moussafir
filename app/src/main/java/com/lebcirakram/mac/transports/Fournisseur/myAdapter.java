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

import com.lebcirakram.mac.transports.Client.ClientMapActivity;
import com.lebcirakram.mac.transports.Models.Fournisseur;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;

/**
 * Created by mac on 7/15/17.
 */

public class myAdapter extends BaseAdapter{
    ArrayList<Fournisseur> arrayList;
    Context context;
    public myAdapter(ArrayList<Fournisseur> list, Context context){
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.itemfournisseur, viewGroup, false);
        }
        ImageView imgtype = view.findViewById(R.id.imagetypetranspport2);
        TextView nomarret = view.findViewById(R.id.nomarret);
        TextView nbrclient = view.findViewById(R.id.nbrclient);
        TextView nbrfournisseur = view.findViewById(R.id.nbrfournisseur);
        ImageButton imgmaps = view.findViewById(R.id.imgmaps2);

        if (arrayList.get(i).getMoyenTransport().toString().equals("Bus")){
            imgtype.setImageResource(R.drawable.ic_directions_bus_black_24dp);
        }else if (arrayList.get(i).getMoyenTransport().toString().equals("Etusa")){
            imgtype.setImageResource(R.drawable.ic_train_black_24dp);
        }else if (arrayList.get(i).getMoyenTransport().toString().equals("Taxi")){
            imgtype.setImageResource(R.drawable.ic_local_taxi_black_24dp);
        }

        nomarret.setText(arrayList.get(i).getName().toString());
        nbrclient.setText(arrayList.get(i).getNbrPlace()+" client");
        nbrfournisseur.setText(arrayList.size()-i+" fournisseur");

        imgmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click();
            }
        });

        return view;
    }

    public void click(){
        Intent i = new Intent(context, FournisseurMapActivity.class);
        context.startActivity(i);
    }
}
