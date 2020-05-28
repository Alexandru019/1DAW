package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    private Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(ListView)findViewById(R.id.lv1);
        adaptador=new Adaptador(this,listado());
        lista.setAdapter(adaptador);


    }
    private ArrayList<Entidad> listado(){
        ArrayList<Entidad>listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.mercurio,"Mercurio","El abrasado"));
        listItems.add(new Entidad(R.drawable.venus,"Venus","Como la diosa"));
        listItems.add(new Entidad(R.drawable.mercurio,"Tierra","Donde vivo yo"));
        listItems.add(new Entidad(R.drawable.marte,"Marte","El planeta Rojo"));
        listItems.add(new Entidad(R.drawable.jupiter,"Jupiter","El gigante de Gas"));
        listItems.add(new Entidad(R.drawable.saturno,"Saturno","El del anillo"));
        listItems.add(new Entidad(R.drawable.neptuno,"Neptuno","Azulito"));



        return listItems;
    }
}
