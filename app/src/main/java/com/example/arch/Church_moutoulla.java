package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Church_moutoulla extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.church_moutoulla);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);
        ImageButton link2 = (ImageButton) findViewById(R.id.link2);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("http://www.mcw.gov.cy/mcw/DA/DA.nsf/All/FB5FDD9D221C988DC2257199003216AE?OpenDocument");

            }

        });


    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





