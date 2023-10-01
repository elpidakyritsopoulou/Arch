package com.example.arch;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class first_page extends frontPage {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);


        ImageView logo = (ImageView) findViewById(R.id.ImageViewAthens);
        ImageView logoItaly = (ImageView) findViewById(R.id.ImageViewItaly);
        ImageView logoSpain = (ImageView) findViewById(R.id.ImageViewSpain);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first_page.this, Greece.class));
            }
        });

        logoItaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first_page.this, Italy.class));
            }
        });

//        logoSpain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(first_page.this, Spain.class));
//            }
//        });
    }

}
