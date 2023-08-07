package com.example.arch;



import static androidx.core.content.ContextCompat.startActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class frontPage {

    public void goTofirst_page (View view){
        Intent intent = new Intent (this, first_page.class);
        startActivity(intent);
    }

    public void goTofirst_page(View view) {
    }
}

