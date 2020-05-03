package com.example.superheroefavorito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Enviar;
    private EditText Heroe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Enviar=(Button)findViewById(R.id.btEnviar);
        Heroe=(EditText)findViewById(R.id.txtHeroe);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviaHeroe();
            }
        });
    }

    private void enviaHeroe(){
        Intent intent=new Intent(MainActivity.this,Mensaje.class);
        String superheroe=Heroe.getText().toString();
        intent.putExtra("superheroe",superheroe);
        startActivity(intent);
    }
}
