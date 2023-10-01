package com.example.arch;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Italy extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.italy);

        ImageView materaphoto = (ImageView) findViewById(R.id.materaphoto);
        ImageView marateaphoto = (ImageView) findViewById(R.id.marateaphoto);
        ImageView assisiphoto = (ImageView) findViewById(R.id.assisiphoto);
        ImageView perugiaphoto = (ImageView) findViewById(R.id.perugiaphoto);

        Button backbutton = (Button) findViewById(R.id.backbutton);


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Italy.this, first_page.class));
            }
        });


        marateaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { startActivity(new Intent(Italy.this, maratea.class)); }
        });

        materaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Italy.this, matera.class));
            }
        });

        assisiphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Italy.this, assisi.class));
            }
        });

        perugiaphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Italy.this, perugia.class));
            }
        });
    }



}