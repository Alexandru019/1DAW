package com.example.listener;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ok;
    private Button cancel;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=(Button)findViewById(R.id.button);
        cancel=(Button)findViewById(R.id.button2);
        info=(TextView)findViewById(R.id.textView);
        View.OnClickListener presionadoOk=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                info.setText("Button Ok Pressed");
            }
        };
        View.OnClickListener presionadoCancel=new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                info.setText("Button Cancel Pressed");
            }
        };
        ok.setOnClickListener(presionadoOk);
        cancel.setOnClickListener(presionadoCancel);

    }


}
