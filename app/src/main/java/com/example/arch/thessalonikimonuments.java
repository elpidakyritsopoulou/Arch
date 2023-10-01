package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class thessalonikimonuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.thessalonikimonuments);

        ImageView whitetower = (ImageView) findViewById(R.id.whitetower);
        ImageView rotonda = (ImageView) findViewById(R.id.rotonda);
        ImageView kamara = (ImageView) findViewById(R.id.kamara);

        whitetower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thessalonikimonuments.this, whitetower.class));
            }
        });

        kamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thessalonikimonuments.this, kamara.class));
            }
        });

        rotonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thessalonikimonuments.this, rotonda.class));
            }
        });
    }
}