package com.lebcirakram.mac.transports.Client.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.internal.NavigationMenu;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.lebcirakram.mac.transports.Client.ClientActivity;
import com.lebcirakram.mac.transports.Client.ItineraireActivity;
import com.lebcirakram.mac.transports.Client.myAdapter;
import com.lebcirakram.mac.transports.Models.Fournisseur;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;

import io.github.yavski.fabspeeddial.FabSpeedDial;


public class ListFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = (ListView) view.findViewById(R.id.listclient);
        arrayList = new ArrayList<>();
        Fournisseur f = new Fournisseur("", "Akram", "Fournisseur", "", 40, null, null, "Bus", null, 3, 50);
        arrayList.add(f);
        Fournisseur f1 = new Fournisseur("", "Ala", "Fournisseur", "", 3, null, null, "Taxi", null, 3, 30);
        arrayList.add(f1);
        Fournisseur f2 = new Fournisseur("", "Ahmed", "Fournisseur", "", 13, null, null, "Etusa", null, 3, 40);
        arrayList.add(f2);
        Fournisseur f3 = new Fournisseur("", "Alilo", "Fournisseur", "", 20, null, null, "Bus", null, 3, 80);
        arrayList.add(f3);
        Fournisseur f4 = new Fournisseur("", "Mouhamed", "Fournisseur", "", 5, null, null, "Taxi", null, 3, 60);
        arrayList.add(f4);
        Fournisseur f5 = new Fournisseur("", "Ishak", "Fournisseur", "", 9, null, null, "Etusa", null, 3, 20);
        arrayList.add(f5);
        Fournisseur f6 = new Fournisseur("", "Lotfi", "Fournisseur", "", 9, null, null, "Bus", null, 3, 50);
        arrayList.add(f6);
        Fournisseur f7 = new Fournisseur("", "Amir", "Fournisseur", "", 9, null, null, "Taxi", null, 3, 30);
        arrayList.add(f7);

        adapter = new myAdapter(arrayList, getContext());
        listView.setAdapter(adapter);

        FabSpeedDial fab = (FabSpeedDial) view.findViewById(R.id.fb_filter);
        fab.setMenuListener(new FabSpeedDial.MenuListener() {
            @Override
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            @Override
            public boolean onMenuItemSelected(MenuItem menuItem) {
                arrayList.clear();
                int id = menuItem.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.bus) {
                    Fournisseur f = new Fournisseur("", "Akram", "Fournisseur", "", 40, null, null, "Bus", null, 3, 50);
                    arrayList.add(f);
                    Fournisseur f3 = new Fournisseur("", "Alilo", "Fournisseur", "", 20, null, null, "Bus", null, 3, 80);
                    arrayList.add(f3);
                    Fournisseur f6 = new Fournisseur("", "Lotfi", "Fournisseur", "", 9, null, null, "Bus", null, 3, 50);
                    arrayList.add(f6);

                    adapter.notifyDataSetChanged();
                }else if (id == R.id.taxi){
                    Fournisseur f1 = new Fournisseur("", "Ala", "Fournisseur", "", 3, null, null, "Taxi", null, 3, 30);
                    arrayList.add(f1);
                    Fournisseur f4 = new Fournisseur("", "Mouhamed", "Fournisseur", "", 5, null, null, "Taxi", null, 3, 60);
                    arrayList.add(f4);
                    Fournisseur f7 = new Fournisseur("", "Amir", "Fournisseur", "", 9, null, null, "Taxi", null, 3, 30);
                    arrayList.add(f7);

                    adapter.notifyDataSetChanged();
                }else if (id == R.id.etusa){
                    Fournisseur f2 = new Fournisseur("", "Ahmed", "Fournisseur", "", 13, null, null, "Etusa", null, 3, 40);
                    arrayList.add(f2);
                    Fournisseur f5 = new Fournisseur("", "Ishak", "Fournisseur", "", 9, null, null, "Etusa", null, 3, 20);
                    arrayList.add(f5);

                    adapter.notifyDataSetChanged();
                }else if (id == R.id.tout){
                    Fournisseur f = new Fournisseur("", "Akram", "Fournisseur", "", 40, null, null, "Bus", null, 3, 50);
                    arrayList.add(f);
                    Fournisseur f1 = new Fournisseur("", "Ala", "Fournisseur", "", 3, null, null, "Taxi", null, 3, 30);
                    arrayList.add(f1);
                    Fournisseur f2 = new Fournisseur("", "Ahmed", "Fournisseur", "", 13, null, null, "Etusa", null, 3, 40);
                    arrayList.add(f2);
                    Fournisseur f3 = new Fournisseur("", "Alilo", "Fournisseur", "", 20, null, null, "Bus", null, 3, 80);
                    arrayList.add(f3);
                    Fournisseur f4 = new Fournisseur("", "Mouhamed", "Fournisseur", "", 5, null, null, "Taxi", null, 3, 60);
                    arrayList.add(f4);
                    Fournisseur f5 = new Fournisseur("", "Ishak", "Fournisseur", "", 9, null, null, "Etusa", null, 3, 20);
                    arrayList.add(f5);
                    Fournisseur f6 = new Fournisseur("", "Lotfi", "Fournisseur", "", 9, null, null, "Bus", null, 3, 50);
                    arrayList.add(f6);
                    Fournisseur f7 = new Fournisseur("", "Amir", "Fournisseur", "", 9, null, null, "Taxi", null, 3, 30);
                    arrayList.add(f7);

                    adapter.notifyDataSetChanged();
                }

                return true;
            }

            @Override
            public void onMenuClosed() {

            }
        });
    }
}
