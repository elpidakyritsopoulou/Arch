package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class whitetower extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.whitetower);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);
        ImageButton link2 = (ImageButton) findViewById(R.id.link2);
        ImageButton link3 = (ImageButton) findViewById(R.id.link3);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.lpth.gr/history-weg-74399.html");

            }

        });

        link2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://greeking.me/blog/greek-culture/thessaloniki-white-tower");

            }

        });

        link3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.visitgreece.gr/experiences/culture/archaeological-sites-and-monuments/the-white-tower/");

            }

        });
    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


}




