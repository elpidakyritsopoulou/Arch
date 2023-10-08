package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SantiagoCompostela_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.santiagocompostela_monuments);

        ImageView cathedralofsantiago = (ImageView) findViewById(R.id.cathedralofsantiago);
        ImageView plaza = (ImageView) findViewById(R.id.plaza);
        ImageView camino = (ImageView) findViewById(R.id.camino);

        cathedralofsantiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SantiagoCompostela_monuments.this, Cathedralofsantiago.class));
            }
        });

        plaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SantiagoCompostela_monuments.this, Plaza.class));
            }
        });

        camino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SantiagoCompostela_monuments.this, Camino.class));
            }
        });
    }
}