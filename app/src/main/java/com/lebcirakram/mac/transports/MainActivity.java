package com.lebcirakram.mac.transports;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.lebcirakram.mac.transports.Client.ClientActivity;
import com.lebcirakram.mac.transports.Client.CllientDetailActivity;
import com.lebcirakram.mac.transports.Fournisseur.FournisseurActivity;
import com.lebcirakram.mac.transports.Fournisseur.FournisseurDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button Login, CreerCompte;
    EditText TVMail, TVpassword;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = (Button) findViewById(R.id.idlogin);
        CreerCompte = (Button) findViewById(R.id.idcreercompte);
        TVMail = (EditText) findViewById(R.id.idmail);
        TVpassword = (EditText) findViewById(R.id.idpassword);

        List<String> list = new ArrayList<String>();
        list.add("Client");
        list.add("Fournisseur");
        final ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Mail = (EditText) findViewById(R.id.idmail);
                EditText Password = (EditText) findViewById(R.id.idpassword);
                //if ((!Mail.getText().toString().equals("")) && (!Password.getText().toString().equals(""))) {
                    if (true) {
                        intent = new Intent(MainActivity.this, CllientDetailActivity.class);
                        startActivity(intent);
                    } else {
                        intent = new Intent(MainActivity.this, FournisseurActivity.class);
                        startActivity(intent);
                    }
               // }
            }
        });

        CreerCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialogcreercompte);
                final Spinner spinner = dialog.findViewById(R.id.spinner);
                final FloatingActionButton fb = dialog.findViewById(R.id.floatingActionButton) ;
                spinner.setAdapter(dataAdapter);
                dialog.show();

                fb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText Mail = dialog.findViewById(R.id.iddialogmail);
                        EditText Password = dialog.findViewById(R.id.iddialogpassword);
                        //if ((!Mail.getText().toString().equals("")) && (!Password.getText().toString().equals("")) && (spinner.getSelectedItem() != null)){
                            dialog.dismiss();
                            if (spinner.getSelectedItem().equals("Client")) {
                                intent = new Intent(MainActivity.this, ClientActivity.class);
                                startActivity(intent);
                            }else {
                                intent = new Intent(MainActivity.this, FournisseurDetailActivity.class);
                                startActivity(intent);
                            }
                       // }
                    }
                });
            }
        });
    }
}
