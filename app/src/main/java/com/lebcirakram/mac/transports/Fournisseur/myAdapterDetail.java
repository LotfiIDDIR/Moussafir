package com.lebcirakram.mac.transports.Fournisseur;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.lebcirakram.mac.transports.Models.Arret;
import com.lebcirakram.mac.transports.R;

import java.util.ArrayList;

/**
 * Created by mac on 7/16/17.
 */

public class myAdapterDetail extends BaseAdapter {


    ArrayList<Arret> arrayList;
    Context context;
    myAdapterDetail(ArrayList<Arret> list , Context context){
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
            view = LayoutInflater.from(context).inflate(R.layout.itemarretdetail, viewGroup, false);
        }

        TextView tvnom = view.findViewById(R.id.idarret);
        EditText edtnom = view.findViewById(R.id.idnomarret);
        EditText edtprix = view.findViewById(R.id.idprixarret);

        tvnom.setText(i+1+"");

        return view;
    }

}
