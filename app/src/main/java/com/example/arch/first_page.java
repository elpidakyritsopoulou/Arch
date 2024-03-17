package com.example.arch;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;

import java.util.Locale;


public class first_page extends frontPage {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        loadLocale();
        setContentView(R.layout.first_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));


        ImageView logo = (ImageView) findViewById(R.id.ImageViewAthens);
        ImageView logoItaly = (ImageView) findViewById(R.id.ImageViewItaly);
        ImageView logocyprus = (ImageView) findViewById(R.id.logoCyprus);
        ImageView logoSpain = (ImageView) findViewById(R.id.ImageViewSpain);
        Button changelanguage = (Button) findViewById(R.id.changelanguage);
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

        logoSpain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first_page.this, Spain.class));
            }
        });

        logocyprus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(first_page.this, Cyprus.class));
            }
        });

        changelanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showChangeLanguageDialog();
            }

            private void showChangeLanguageDialog() {
                final String[] listItems = {"Greek", "Italian", "Spanish", "English"};
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(first_page.this);
                mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            setLocale("gr");
                            recreate();
                        } else if (i == 1) {
                            setLocale("it");
                            recreate();
                        } else if (i == 2) {
                            setLocale("sp");
                            recreate();
                        } else if (i == 3) {
                            setLocale("en");
                            recreate();
                        }

                        dialogInterface.dismiss();
                    }

                    AlertDialog mDialog = mBuilder.create();
                    //mDialog.show();

                    private void setLocale(String lang) {

                        Locale locale = new Locale(lang);
                        Locale.setDefault(locale);
                        Configuration config = new Configuration();
                        config.locale = locale;
                        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
                        editor.putString("My_Lang", lang);
                        editor.apply();

                    }

                    private void loadLocale() {
                        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
                        String language = prefs.getString("My_Lang", "");
                        setLocale(language);
                    }


                });




            }

        });




    }
}

