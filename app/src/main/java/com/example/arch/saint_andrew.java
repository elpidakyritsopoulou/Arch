package com.example.arch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class saint_andrew extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saint_andrew);

    }

    public void youtube1(View view) {
        Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/AQjLEqW4SSg"));
        startActivity(youtubeIntent);
    }
}
