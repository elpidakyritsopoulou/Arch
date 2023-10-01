package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class perugia_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.perugia_monuments);

        ImageView november_square_photo = (ImageView) findViewById(R.id.november_square_photo);
        ImageView aqueduct_perugia_photo = (ImageView) findViewById(R.id.aqueduct_perugia_photo);
        ImageView umbriaphoto = (ImageView) findViewById(R.id.umbriaphoto);

        november_square_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(perugia_monuments.this, IV_November_Square.class));
            }
        });

        aqueduct_perugia_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(perugia_monuments.this, The_Roman_Aqueduct_in_Perugia.class));
            }
        });

        umbriaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(perugia_monuments.this, National_Gallery_of_Umbria.class));
            }
        });
    }
}