package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Murcia_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.murcia_monuments);

        ImageView teatro = (ImageView) findViewById(R.id.teatro);
        ImageView fortess = (ImageView) findViewById(R.id.fortess);
        ImageView jumilla = (ImageView) findViewById(R.id.jumilla);

        teatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Murcia_monuments.this, Teatro.class));
            }
        });

        fortess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Murcia_monuments.this, Fortess.class));
            }
        });

        jumilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Murcia_monuments.this, Jumilla.class));
            }
        });
    }
}