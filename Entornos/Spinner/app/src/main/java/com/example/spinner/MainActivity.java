package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button aceptar;
    private TextView info;
    private Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aceptar=(Button)findViewById(R.id.btn);
        info=(TextView) findViewById(R.id.txt);
        spin=(Spinner)findViewById(R.id.spinner);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transfiere();
            }
        });
    }
    private void transfiere(){
        info.setText("Has elegido: "+String.valueOf(spin.getSelectedItem()));
    }
}
