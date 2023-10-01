package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Odeon_of_Herodus_Atticus extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.odeon_of_herodus_atticus);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);
        ImageButton link2 = (ImageButton) findViewById(R.id.link2);
        ImageButton link3 = (ImageButton) findViewById(R.id.link3);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.discovergreece.com/experiences/odeon-of-herodes-atticus-athens");

            }

        });

        link2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.thisisathens.org/antiquities/odeon-herodes-atticus");

            }

        });

        link3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://whyathens.com/odeon-of-herodes-atticus/");

            }

        });
    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





