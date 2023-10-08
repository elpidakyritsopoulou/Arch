package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Granada_monuments extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.granada_monuments);

        ImageView laalhambra = (ImageView) findViewById(R.id.laalhambra);
        ImageView cathedral = (ImageView) findViewById(R.id.cathedral);
        ImageView albacin = (ImageView) findViewById(R.id.albacin);

        laalhambra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Granada_monuments.this, laalhambra.class));
            }
        });

        cathedral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Granada_monuments.this, cathedral.class));
            }
        });

        albacin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Granada_monuments.this, albacin.class));
            }
        });
    }
}