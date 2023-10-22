package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class paphos_monuments extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.paphos_monuments);

        ImageView kingstombs = (ImageView) findViewById(R.id.kingstombs);
        ImageView katopaphos = (ImageView) findViewById(R.id.katopaphos);
        ImageView paphoscastle = (ImageView) findViewById(R.id.paphoscastle);

        kingstombs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paphos_monuments.this, Tombs_of_the_Kings.class));
            }
        });

        katopaphos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paphos_monuments.this, paphos_park.class));
            }
        });

        paphoscastle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paphos_monuments.this, paphos_castle.class));
            }
        });
    }
}





