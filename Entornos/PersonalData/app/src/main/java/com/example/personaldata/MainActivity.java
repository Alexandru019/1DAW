package com.example.personaldata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button borrar;
    private Button aceptar;
    private TextView info;
    private EditText nombre;
    private Spinner spin;
    private CheckBox check;
    private RadioGroup grupo;
    private RadioButton elegido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aceptar=(Button)findViewById(R.id.btn1);
        borrar=(Button)findViewById(R.id.btn2);
        info=(TextView)findViewById(R.id.inf);
        nombre=(EditText)findViewById(R.id.editText);
        spin=(Spinner)findViewById(R.id.spinner);
        check=(CheckBox)findViewById(R.id.checkBox);
        grupo=(RadioGroup) findViewById(R.id.radiogrupo);


        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elegido=(RadioButton)findViewById(grupo.getCheckedRadioButtonId());
                if(check.isChecked()){
                    info.setText(nombre.getText()+" ,de "+String.valueOf(spin.getSelectedItem())+" años y estudia");
                }else{
                    info.setText(nombre.getText()+" ,de "+String.valueOf(spin.getSelectedItem())+" años y estudia");

                }

            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("");spin.setSelection(0);check.setChecked(false);info.setText("");
                nombre.setText("");spin.setSelection(0);check.setChecked(false);info.setText("");
            }
        });
    }
}
