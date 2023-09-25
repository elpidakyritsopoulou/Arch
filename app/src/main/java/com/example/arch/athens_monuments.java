package com.example.arch;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class athens_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.athens_monuments);

        ImageView acropolis = (ImageView) findViewById(R.id.acropolis);
        ImageView panathenaic_stadium = (ImageView) findViewById(R.id.panathenaic_stadium1);
        ImageView herodus_atticus = (ImageView) findViewById(R.id.herodusatticus);

        acropolis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(athens_monuments.this, acropolis.class));
            }
        });

        panathenaic_stadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(athens_monuments.this, Panathenaic_stadium.class));
            }
        });

        herodus_atticus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(athens_monuments.this, Odeon_of_Herodus_Atticus.class));
            }
        });
    }
}