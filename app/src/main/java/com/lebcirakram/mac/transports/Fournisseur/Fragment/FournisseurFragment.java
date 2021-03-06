package com.lebcirakram.mac.transports.Fournisseur.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.lebcirakram.mac.transports.Fournisseur.myAdapter;
import com.lebcirakram.mac.transports.Models.Fournisseur;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;


public class FournisseurFragment extends Fragment {

    ListView listView;
    ArrayList<Fournisseur> arrayList;
    myAdapter adapter;

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
        return inflater.inflate(R.layout.fragment_fournisseur, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView) view.findViewById(R.id.listfournisseur);
        arrayList = new ArrayList<>();
        Fournisseur f = new Fournisseur("", "Akram", "Fournisseur", "", 40, null, null, "Bus", null, 3, 5);
        arrayList.add(f);
        Fournisseur f1 = new Fournisseur("", "Ala", "Fournisseur", "", 3, null, null, "Taxi", null, 3, 3);
        arrayList.add(f1);
        Fournisseur f2 = new Fournisseur("", "Ahmed", "Fournisseur", "", 13, null, null, "Etusa", null, 3, 4);
        arrayList.add(f2);
        Fournisseur f3 = new Fournisseur("", "Alilo", "Fournisseur", "", 20, null, null, "Bus", null, 3, 9);
        arrayList.add(f3);
        Fournisseur f4 = new Fournisseur("", "Mouhamed", "Fournisseur", "", 5, null, null, "Taxi", null, 3, 6);
        arrayList.add(f4);
        Fournisseur f5 = new Fournisseur("", "Ishak", "Fournisseur", "", 9, null, null, "Etusa", null, 3, 7);
        arrayList.add(f5);
        Fournisseur f6 = new Fournisseur("", "Lotfi", "Fournisseur", "", 9, null, null, "Bus", null, 3, 5);
        arrayList.add(f6);
        Fournisseur f7 = new Fournisseur("", "Amir", "Fournisseur", "", 9, null, null, "Taxi", null, 3, 6);
        arrayList.add(f7);

        adapter = new myAdapter(arrayList,getContext());
        listView.setAdapter(adapter);
    }
}
