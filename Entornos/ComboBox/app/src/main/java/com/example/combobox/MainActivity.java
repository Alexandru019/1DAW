package com.example.combobox;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox Android;
    private CheckBox Java;
    private CheckBox SQL;
    private TextView info;
    private Button aceptar1;
    private TextView info2;
    private Button aceptar2;
    private RadioGroup grupo;
    private RadioButton RadioElegido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Android=(CheckBox)findViewById(R.id.android);
        Java=(CheckBox)findViewById(R.id.java);
        SQL=(CheckBox)findViewById(R.id.sql);
        info=(TextView)findViewById(R.id.txt);
        aceptar1=(Button) findViewById(R.id.btn);

        aceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acepto1();
            }
        });

        info2=(TextView)findViewById(R.id.txt2);
        aceptar2=(Button) findViewById(R.id.btn2);
        grupo=(RadioGroup) findViewById(R.id.grup);

        aceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acepto2();
            }
        });

    }
    private void acepto1(){
        info.setText("Has seleccionado :");
        if (Android.isChecked()){
            info.setText(info.getText().toString()+" Android");
        }
        if (Java.isChecked()){
            info.setText(info.getText().toString()+" Java");
        }
        if (SQL.isChecked()){
            info.setText(info.getText().toString()+" SQL");
        }
    }
    private void acepto2(){

        RadioElegido=(RadioButton)findViewById(grupo.getCheckedRadioButtonId());
        info2.setText("Has seleccionado :"+RadioElegido.getText().toString());
    }
}
