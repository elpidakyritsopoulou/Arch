package com.example.arch;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Spain extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spain);

        ImageView granadaphoto = (ImageView) findViewById(R.id.granadaphoto);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        granadaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Spain.this, Granada.class));
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Spain.this, first_page.class));
            }
        });

        ImageView zaragozaphoto = (ImageView) findViewById(R.id.zaragozaphoto);
        zaragozaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Spain.this, Zaragoza.class)); }
        });

        ImageView murciaphoto = (ImageView) findViewById(R.id.murciaphoto);
        murciaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Spain.this, Murcia.class)); }
        });

        ImageView santiagocompostelaphoto = (ImageView) findViewById(R.id.santiagocompostelaphoto);
        santiagocompostelaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Spain.this, Santiagocompostela.class)); }
        });


    }



}