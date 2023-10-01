package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class corfu_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.corfu_monuments);

        ImageView oldfortess = (ImageView) findViewById(R.id.oldfortess);
        ImageView newfortess = (ImageView) findViewById(R.id.newfortess);
        ImageView paleopolis = (ImageView) findViewById(R.id.paleopolis);

        oldfortess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(corfu_monuments.this, oldfortess.class));
            }
        });

        newfortess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(corfu_monuments.this, newfortess.class));
            }
        });

        paleopolis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(corfu_monuments.this, paleopolis.class));
            }
        });
    }
}