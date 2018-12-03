package com.example.davidvarassolano.lloguermaterialgires;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater;
    Context contexto;
    String[][] datos;
    public Adaptador (Context conext, String[][] datos){
        this.datos = datos;
        this.contexto = conext;
        inflater = (LayoutInflater)conext.getSystemService(conext.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        final View vista = inflater.inflate(R.layout.layoutlistaentregades,null);
        TextView Nomcomanda = (TextView)vista.findViewById(R.id.lbl_nom);
        //TextView Data = vista.findViewById(R.id.lbl_data);
        ImageView imagen = (ImageView)vista.findViewById(R.id.ImEntregat);
        TextView DiaTornada =(TextView) vista.findViewById(R.id.lbl_dia);
        Nomcomanda.setText(datos[i][0]);
        DiaTornada.setText(datos[i][1]);
        return vista;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
