package com.example.grideadobrooooo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView grid;
    private String [] letras={"A","B","C","D","E","F","G","H","I","J","K","L","M","Ñ","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=(GridView)findViewById(R.id.Grid1);

        ArrayAdapter adaptaLetras=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,letras);
        grid.setAdapter(adaptaLetras);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast flotador=Toast.makeText(getApplicationContext(), (CharSequence) grid.getItemAtPosition(position),Toast.LENGTH_SHORT);
                flotador.show();
            }
        });


    }
}
