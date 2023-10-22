package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Tombs_of_the_Kings extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.tombs_of_the_kings);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("http://www.mcw.gov.cy/mcw/da/da.nsf/All/238DE8D409BF6077C225719B0039F785?OpenDocument ");

            }

        });

    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





