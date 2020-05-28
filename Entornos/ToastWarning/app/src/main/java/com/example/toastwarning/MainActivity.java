package com.example.toastwarning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button B1;
    private Button B2;
    private Button B3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.btn1);
        B2=(Button)findViewById(R.id.btn2);
        B3=(Button)findViewById(R.id.btn3);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Toast por Defecto",Toast.LENGTH_LONG).show();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast flotador=Toast.makeText(getApplicationContext(),"Toast Gravitacionado",Toast.LENGTH_LONG);
                flotador.setGravity(Gravity.CENTER,Gravity.LEFT,0);
                flotador.show();
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.auxiliar,    null);
                Toast customi = new Toast(getApplicationContext());
                customi.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                customi.setDuration(Toast.LENGTH_LONG);
                customi.setView(layout);
                customi.show();
            }
        });
    }
}
