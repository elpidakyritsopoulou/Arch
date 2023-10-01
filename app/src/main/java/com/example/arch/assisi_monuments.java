package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class assisi_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.assisi_monuments);

        ImageView san_francesco_photo = (ImageView) findViewById(R.id.san_francesco_photo);
        ImageView woods_francesco_photo = (ImageView) findViewById(R.id.woods_francesco_photo);
        ImageView minerva_photo = (ImageView) findViewById(R.id.minerva_photo);

        san_francesco_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(assisi_monuments.this, Basilica_of_San_Francesco.class));
            }
        });

        woods_francesco_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(assisi_monuments.this, The_Woods_of_San_Francesco.class));
            }
        });

        minerva_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(assisi_monuments.this, Temple_of_minerva.class));
            }
        });
    }
}