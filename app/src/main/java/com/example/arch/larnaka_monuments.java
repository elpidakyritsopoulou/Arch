package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class larnaka_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.larnaka_monuments);

        ImageView lazarus = (ImageView) findViewById(R.id.lazarus);
        ImageView medievalcastlephoto = (ImageView) findViewById(R.id.medievalcastlephoto);
        ImageView larnakamuseum = (ImageView) findViewById(R.id.larnakamuseum);

        lazarus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(larnaka_monuments.this, Church_of_Saint_Lazarus.class));
            }
        });

        medievalcastlephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(larnaka_monuments.this, Larnaka_medieval_castle.class));
            }
        });

        larnakamuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(larnaka_monuments.this, Larnaka_museum.class));
            }
        });
    }
}