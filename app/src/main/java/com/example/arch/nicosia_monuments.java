package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class nicosia_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.nicosia_monuments);

        ImageView moutoulla = (ImageView) findViewById(R.id.moutoulla);
        ImageView cyprusmuseum = (ImageView) findViewById(R.id.cyprusmuseum);
        ImageView tamassos = (ImageView) findViewById(R.id.tamassos);

        moutoulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nicosia_monuments.this, Church_moutoulla.class));
            }
        });

        cyprusmuseum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nicosia_monuments.this, The_Cyprus_Museum.class));
            }
        });

        tamassos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(nicosia_monuments.this, Archaeological_Site_of_Tamassos.class));
            }
        });
    }
}