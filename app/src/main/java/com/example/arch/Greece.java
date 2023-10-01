package com.example.arch;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Greece extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.greece);

        ImageView patrasphoto = (ImageView) findViewById(R.id.patraphoto);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        patrasphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greece.this, patras.class));
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Greece.this, first_page.class));
            }
        });

        ImageView athensphoto = (ImageView) findViewById(R.id.athensphoto);
        athensphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Greece.this, athens.class)); }
        });

        ImageView thessalonikiphoto = (ImageView) findViewById(R.id.thessalonikiphoto);
        thessalonikiphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Greece.this, thessaloniki.class)); }
        });

    }



}