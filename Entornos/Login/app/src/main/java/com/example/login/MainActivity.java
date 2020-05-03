package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText usuario;
    private EditText password;
    private Button Enviar;
    private TextView informa;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador=5;
        usuario=(EditText)findViewById(R.id.txtUsuario);
        password=(EditText)findViewById(R.id.txtPass);
        Enviar=(Button)findViewById(R.id.btEnviar);
        informa=(TextView)findViewById(R.id.info);

        informa.setText("El numero de intentos es: "+contador);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verifica(usuario.getText().toString(),password.getText().toString());
                usuario.setText("");
                password.setText("");

                if(contador==0){
                    Enviar.setEnabled(false);
                    informa.setText(informa.getText()+"\n Sin intentos restantes");
                }
            }
        });
    }

    private void verifica(String nombre,String passwd){
        if (nombre.equals("Admin") && passwd.equals("Admin")){
            Intent intent=new Intent(MainActivity.this,Dialogo.class);
            startActivity(intent);

        }else{
            contador--;
            informa.setText("El numero de intentos es: "+contador);
        }
    }
}
