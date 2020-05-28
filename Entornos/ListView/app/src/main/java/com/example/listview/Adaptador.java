package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context miContexto;
    private ArrayList<Entidad> listItems;

    public Adaptador(Context c,ArrayList<Entidad> l){
        miContexto=c;
        listItems=l;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int position) {
        return listItems.get(position);
    }

    @Override
    public long getItemId(int A) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Entidad item=(Entidad) getItem(position);

        convertView = LayoutInflater.from(miContexto).inflate(R.layout.item_list,null);
        ImageView imgFoto =(ImageView) convertView.findViewById(R.id.imgFoto);
        TextView titulo=(TextView) convertView.findViewById(R.id.tvTitulo);
        TextView contenido=(TextView) convertView.findViewById(R.id.tvContenido);

        imgFoto.setImageResource(item.getImgFoto());
        titulo.setText(item.getTitulo());
        contenido.setText(item.getContenido());
        return convertView;
    }
}
