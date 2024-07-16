package com.example.arch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class acropolis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.acropolis);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton link1 = findViewById(R.id.link1);
        ImageButton link2 = findViewById(R.id.link2);
        ImageButton link3 = findViewById(R.id.link3);
        ImageButton facebookLink = findViewById(R.id.facebook_link);
        com.google.android.material.floatingactionbutton.FloatingActionButton location_acropolis = findViewById(R.id.location_acropolis);

        String locationUrl = "https://maps.app.goo.gl/hsMYxLAXg2WMJzbj8";
        location_acropolis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(locationUrl)));
            }
        });

        link1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                goLink("https://www.visitgreece.gr/experiences/culture/archaeological-sites-and-monuments/acropolis-of-athens/");
            }
        });

        link2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                goLink("https://whc.unesco.org/en/list/404/");
            }
        });

        link3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                goLink("https://www.theacropolismuseum.gr/en/");
            }
        });

        facebookLink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                goLink("https://www.facebook.com/theacropolismuseum");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_greece:
                startActivity(new Intent(this, Greece.class));
                return true;
            case R.id.action_italy:
                startActivity(new Intent(this, Italy.class));
                return true;
            case R.id.action_spain:
                startActivity(new Intent(this, Spain.class));
                return true;
            case R.id.action_cyprus:
                startActivity(new Intent(this, Cyprus.class));
                return true;
            case R.id.action_change_language:
                showChangeLanguageDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showChangeLanguageDialog() {
        final String[] listItems = {"English", "Ελληνικά", "Spanish", "Italian"};
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        mBuilder.setTitle("Choose Language");
        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String langCode = "";
                switch (i) {
                    case 0:
                        langCode = "en";
                        break;
                    case 1:
                        langCode = "el";
                        break;
                    case 2:
                        langCode = "es";
                        break;
                    case 3:
                        langCode = "it";
                        break;
                }
                setLocale(langCode);
                dialogInterface.dismiss();
                recreate();
            }
        });

        AlertDialog mDialog = mBuilder.create();
        mDialog.show();
    }

    private void setLocale(String lang) {
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();

        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getResources().updateConfiguration(config, getResources().getDisplayMetrics());
    }

    public void loadLocale() {
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(updateBaseContextLocale(base));
    }

    private Context updateBaseContextLocale(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String lang = preferences.getString("My_Lang", "");
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);

        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);

        return context.createConfigurationContext(configuration);
    }

    private void goLink(String url) {
        Uri uri = Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

}
