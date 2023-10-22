package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class paphos_castle extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.paphos_castle);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("http://www.mcw.gov.cy/mcw/DA/DA.nsf/All/D3F770E201E1C528C225719900330DD6?OpenDocument");

            }

        });

    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





