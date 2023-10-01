package com.example.arch;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class IV_November_Square extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.iv_november_square);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);
        ImageButton link2 = (ImageButton) findViewById(R.id.link2);


        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://www.youtube.com/watch?v=8nu2IrBdpmo");

            }

        });

        link2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("https://turismo.comune.perugia.it/poi/fontana-maggiore");

            }

        });

    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };


    }





