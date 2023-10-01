package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class maratea_monuments extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.maratea_monuments);

        ImageView castrocucco_castle_photo = (ImageView) findViewById(R.id.castrocucco_castle_photo);
        ImageView st_blaise_photo = (ImageView) findViewById(R.id.st_blaise_photo);
        ImageView christ_redeemer = (ImageView) findViewById(R.id.christ_redeemer);

        castrocucco_castle_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(maratea_monuments.this, Castrocucco_Castle.class));
            }
        });

        st_blaise_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(maratea_monuments.this, The_Basilica_of_St_Blaise.class));
            }
        });

        christ_redeemer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(maratea_monuments.this, The_Statue_of_the_Christ_the_Redeemer.class));
            }
        });
    }
}





