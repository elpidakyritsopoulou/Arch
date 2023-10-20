package com.example.arch;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Church_of_Saint_Lazarus extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.church_of_saint_lazarus);


        ImageButton link1 = (ImageButton) findViewById(R.id.link1);



        link1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                goLink("http://en.agioslazaros.org.cy/ ");

            }

        });


    }
    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    };
    }



