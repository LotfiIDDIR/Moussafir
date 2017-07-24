package com.lebcirakram.mac.transports.Client;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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
    public View getView(final int i, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.itemclient, viewGroup, false);
        }
        ImageView imgtype = view.findViewById(R.id.imagetypetranspport);
        TextView nomfournisseur = view.findViewById(R.id.nomfournisseur);
        TextView time = view.findViewById(R.id.time);
        TextView nbrplacevide = view.findViewById(R.id.nbrplacevide);
        TextView prix = view.findViewById(R.id.prix);
        ImageButton imgmaps = view.findViewById(R.id.imgmaps);

        if (arrayList.get(i).getMoyenTransport().toString().equals("Bus")){
            imgtype.setImageResource(R.drawable.ic_directions_bus_black_24dp);
        }else if (arrayList.get(i).getMoyenTransport().toString().equals("Etusa")){
            imgtype.setImageResource(R.drawable.ic_train_black_24dp);
        }else if (arrayList.get(i).getMoyenTransport().toString().equals("Taxi")){
            imgtype.setImageResource(R.drawable.ic_local_taxi_black_24dp);
        }

        nomfournisseur.setText(arrayList.get(i).getName().toString());
        time.setText(arrayList.get(i).getTime()+" Min");
        nbrplacevide.setText(arrayList.get(i).getNbrPlace()+" Places");
        prix.setText(arrayList.get(i).getTime()+" DAD");

        imgmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ClientMapActivity.class);
                intent.putExtra("p",i);
                intent.putExtra("name",arrayList.get(i).getName().toString());
                context.startActivity(intent);
            }
        });

        return view;
    }
}
