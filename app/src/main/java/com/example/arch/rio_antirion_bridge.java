package com.example.arch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class rio_antirion_bridge extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rio_antirio_bridge);



    ImageButton link1 = (ImageButton) findViewById(R.id.link1);
    ImageButton link2 = (ImageButton) findViewById(R.id.link2);
    ImageButton link3 = (ImageButton) findViewById(R.id.link3);


        link1.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://www.gefyra.gr/en/");

        }

    });

        link2.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://www.roadtraffic-technology.com/projects/rion-antirion/");

        }

    });

        link3.setOnClickListener(new View.OnClickListener() {

        public void onClick(View view) {
            goLink("https://www.allovergreece.com/Bridge/Descr/4/en");

        }

    });
}
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };
}

