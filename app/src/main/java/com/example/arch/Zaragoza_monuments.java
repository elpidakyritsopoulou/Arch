package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Zaragoza_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.zaragoza_monuments);

        ImageView basilica = (ImageView) findViewById(R.id.basilica);
        ImageView cathedralsalvador = (ImageView) findViewById(R.id.cathedralsalvador);
        ImageView palacio = (ImageView) findViewById(R.id.palacio);

        basilica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Zaragoza_monuments.this, Basilica.class));
            }
        });

        cathedralsalvador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Zaragoza_monuments.this, Cathedralsalvador.class));
            }
        });

        palacio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Zaragoza_monuments.this, Palacio.class));
            }
        });
    }
}