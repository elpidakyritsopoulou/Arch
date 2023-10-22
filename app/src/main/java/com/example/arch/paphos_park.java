package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class paphos_park extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.paphos_park);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("http://www.mcw.gov.cy/mcw/DA/DA.nsf/All/59FFC9310818070EC225719B003A2EB8");

            }

        });

    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





