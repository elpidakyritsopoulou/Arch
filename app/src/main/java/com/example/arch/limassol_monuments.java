package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class limassol_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.limassol_monuments);

        ImageView kourion = (ImageView) findViewById(R.id.kourion);
        ImageView limassolcastlephoto = (ImageView) findViewById(R.id.limassolcastlephoto);
        ImageView amanthus = (ImageView) findViewById(R.id.amanthus);

        kourion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(limassol_monuments.this, Kourion_Archaeological_Site.class));
            }
        });

        limassolcastlephoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(limassol_monuments.this, Limassol_Medieval_Castle.class));
            }
        });

        amanthus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(limassol_monuments.this, Amathus_Archaeological_Site.class));
            }
        });
    }
}