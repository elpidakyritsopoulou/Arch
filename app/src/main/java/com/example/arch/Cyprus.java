package com.example.arch;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Cyprus extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cyprus);

        ImageView nicosiaphoto = (ImageView) findViewById(R.id.nicosiaphoto);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        nicosiaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cyprus.this, nicosia.class));
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Cyprus.this, first_page.class));
            }
        });

        ImageView limassolphoto = (ImageView) findViewById(R.id.limassolphoto);
        limassolphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Cyprus.this, limassol.class)); }
        });

        ImageView larnakaphoto = (ImageView) findViewById(R.id.larnakaphoto);
        larnakaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Cyprus.this, Larnaka.class)); }
        });
//
//        ImageView corfuphoto = (ImageView) findViewById(R.id.corfuphoto);
//        corfuphoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) { startActivity(new Intent(Cyprus.this, corfu.class)); }
//        });


    }



}