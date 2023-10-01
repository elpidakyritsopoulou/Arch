package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class patras_monuments extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.patras_monuments);

        ImageView saint_andrew_photo = (ImageView) findViewById(R.id.saint_andrew_photo);
        ImageView roman_odeon_photo = (ImageView) findViewById(R.id.roman_odeon_photo);
        ImageView rion_antirion_photo = (ImageView) findViewById(R.id.rion_antirion_photo);

        saint_andrew_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patras_monuments.this, saint_andrew.class));
            }
        });

        roman_odeon_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patras_monuments.this, roman_odeon.class));
            }
        });

        rion_antirion_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(patras_monuments.this, rio_antirion_bridge.class));
            }
        });
    }
}





