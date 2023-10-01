package com.example.arch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class saint_andrew extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saint_andrew);



    ImageButton link1 = (ImageButton) findViewById(R.id.link1);
    ImageButton link2 = (ImageButton) findViewById(R.id.link2);
    ImageButton link3 = (ImageButton) findViewById(R.id.link3);


        link1.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://www.patrasinfo.com/en/saint-andrews-church-patras/");

        }

    });

        link2.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://insightsgreece.com/cathedral-of-agios-andreas-in-patras-greeces-largest-church/");

        }

    });

        link3.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://patrascasale.gr/index.php/en/blog/saintandrew");

        }

    });
}
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };

    }
