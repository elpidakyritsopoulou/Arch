package com.example.arch;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class frontPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        Button welcome_button = (Button) findViewById(R.id.welcome_button);
        welcome_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(frontPage.this, first_page.class);
                startActivity(intent);

            }
        });
    }

//
//    public void openfirst_page() {
//        Intent intent = new Intent(frontPage.this,first_page.class);
//        startActivity(intent);
//    }

}



