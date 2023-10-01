package com.example.arch;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class matera extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matera);

        Button backbutton = (Button) findViewById(R.id.backbutton);
        Button readmore = (Button) findViewById(R.id.button);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(matera.this, Italy.class));
            }
        });

        readmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(matera.this, athens_monuments.class));
            }
        });
    }


}
