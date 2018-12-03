package com.example.davidvarassolano.lloguermaterialgires;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class NormalUserActivity extends AppCompatActivity {

    private ListView ListEntregades;
    private static final int EDIT_NAME = 3;



    String [] [] datos = {
            {"Cova Forat Mico", "19/11/2018"},
            {"Aneto", "15/12/2018"},
            {"Pica d' estats", "20/01/2019"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_user);
        ListEntregades = (ListView)findViewById(R.id.list_entregades);
        ListEntregades.setAdapter(new Adaptador(this, datos));

    }

    public void newComand(final View view) {
        AlertDialog.Builder novacomanda = new AlertDialog.Builder(this);
        novacomanda.setMessage("Introduïu el nom de la comanda");
        novacomanda.setTitle("Comanda");
        final EditText Nomcomanda = new EditText(this);
        novacomanda.setView(Nomcomanda);
        novacomanda.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String nomcomanda = Nomcomanda.getText().toString();
                if (nomcomanda.isEmpty()){
                    Toast.makeText(NormalUserActivity.this,"Posa un nom vago",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(NormalUserActivity.this,"Creant comanda"+" "+nomcomanda,Toast.LENGTH_SHORT).show();
                    //Crear la nova activitat
                    novacomanda(nomcomanda);

                }

            }
        });
        novacomanda.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(NormalUserActivity.this,"Comanda cancel·lada",Toast.LENGTH_SHORT).show();
            }
        });
        novacomanda.show();


    }
    public void novacomanda (String nomcomanda){
        Intent intent = new Intent(this,EditCommandActivity.class);
        intent.putExtra("name",nomcomanda);

        startActivityForResult(intent,EDIT_NAME);
    }
}
