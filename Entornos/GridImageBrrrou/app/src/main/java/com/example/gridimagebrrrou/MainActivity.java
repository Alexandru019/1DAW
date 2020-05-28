package com.example.gridimagebrrrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gd1=(GridView)findViewById(R.id.Grid1);
        gd1.setAdapter(new ImageAdapter(this));

        gd1.setOnItemClickListener();
    }
}
