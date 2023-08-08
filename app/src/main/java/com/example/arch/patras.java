package com.example.arch;



import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class patras extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patras);
    }
    public void startSecondActivity(frontPage view) {
        frontPage intent = new frontPage ();
        Intent frontPage = null;
        startActivity(frontPage);
    }

}
