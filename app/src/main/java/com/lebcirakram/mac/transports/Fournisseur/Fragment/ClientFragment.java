package com.lebcirakram.mac.transports.Fournisseur.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.lebcirakram.mac.transports.Client.myAdapter;
import com.lebcirakram.mac.transports.Fournisseur.myAdapterclient;
import com.lebcirakram.mac.transports.Models.Arret;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;


public class ClientFragment extends Fragment {

    ListView listView;
    ArrayList<Arret> arrayList;
    myAdapterclient adapter;

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
        return inflater.inflate(R.layout.fragment_client, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listfournisseurclient);

        arrayList = new ArrayList<>();
        Arret r = new Arret(null,"Soumam Bis Bus Stop",2,50.00);
        arrayList.add(r);
        Arret r1 = new Arret(null,"Gare Routiere du Caroubier",6,30.00);
        arrayList.add(r1);
        Arret r2 = new Arret(null,"Gare de Champs de Manoeuvre",4,10.00);
        arrayList.add(r2);




        adapter = new myAdapterclient(arrayList,getContext());
        listView.setAdapter(adapter);
    }
}
