package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class matera_monuments extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.matera_monuments);

        ImageView the_sassi = (ImageView) findViewById(R.id.the_sassi);
        ImageView tramontano_photo = (ImageView) findViewById(R.id.tramontano_photo);
        ImageView murgia_park_photo = (ImageView) findViewById(R.id.murgia_park_photo);

        the_sassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(matera_monuments.this, The_Sassi.class));
            }
        });

        tramontano_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(matera_monuments.this, The_Castello_Tramontano.class));
            }
        });

        murgia_park_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(matera_monuments.this, The_Murgia_Park.class));
            }
        });
    }
}





