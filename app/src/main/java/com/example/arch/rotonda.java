package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class rotonda extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.rotonda);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);
        ImageButton link2 = (ImageButton) findViewById(R.id.link2);
        ImageButton link3 = (ImageButton) findViewById(R.id.link3);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.thebyzantinelegacy.com/rotunda-thessaloniki");

            }

        });

        link2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.thessalonikitourism.gr/index.php/en/component/k2/item/72-church-of-agios-georgios-rotunda");

            }

        });

        link3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://thessalonikilocal.com/visiting-the-rotonda-of-thessaloniki/");

            }

        });
    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


}




