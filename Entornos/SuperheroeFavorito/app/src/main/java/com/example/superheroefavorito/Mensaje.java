package com.example.superheroefavorito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Mensaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);
        Intent intent=getIntent();
        TextView texto=(TextView)findViewById(R.id.Texto);
        texto.setText(intent.getStringExtra("superheroe")+" mola mucho");
        texto.setTextSize(25);
    }
}
