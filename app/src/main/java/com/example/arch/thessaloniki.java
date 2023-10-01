package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class thessaloniki extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thessaloniki);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        Button readmore = (Button) findViewById(R.id.readmore);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thessaloniki.this, Greece.class));
            }
        });

        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(thessaloniki.this, thessalonikimonuments.class));
            }
        });
    }


}
