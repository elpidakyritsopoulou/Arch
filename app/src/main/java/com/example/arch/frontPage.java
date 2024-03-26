package com.example.arch;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class frontPage extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    String[] item = {"Greece", "Italy", "Spain", "Cyprus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale(); // Load the saved locale
        setContentView(R.layout.front_page);
        ActionBar actionBar = getSupportActionBar();
//       actionBar.setTitle("Arch");
        ImageView changeLang = findViewById(R.id.changelanguage);
        changeLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showChangeLanguageDialog();
            }
        });

        ImageView logo = findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(frontPage.this, first_page.class));
            }
        });



        autoCompleteTextView = findViewById(R.id.auto_complete_txt);
        adapterItems = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();
                Class<?> activityClass = getActivityClass(selectedItem);
                if (activityClass != null) {
                    startActivity(new Intent(frontPage.this, activityClass));
                } else {
                    Toast.makeText(frontPage.this, "Activity not found for country: " + selectedItem, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Load saved language
        loadLocale();
    }

    // Method to map country names to activity classes
    private Class<?> getActivityClass(String country) {
        switch (country) {
            case "Greece":
                return Greece.class;
            case "Italy":
                return Italy.class;
            case "Spain":
                return Spain.class;
            case "Cyprus":
                return Cyprus.class;
            default:
                return null;
        }
    }

    private void showChangeLanguageDialog() {
        final String[] listItems = {"English", "Ελληνικά", "Spanish", "Italian"}; // Greek added here
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(this);
        mBuilder.setTitle("Choose Language");
        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String langCode = ""; // Initialize the language code variable
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
                setLocale(langCode); // Set the selected language
                Locale locale = new Locale(langCode);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                getResources().updateConfiguration(config, getResources().getDisplayMetrics());

                dialogInterface.dismiss();
                recreate(); // Recreate the activity to apply the language change
            }
        });

        AlertDialog mDialog = mBuilder.create();
        mDialog.show();
    }


//    AlertDialog mDialog = mBuilder.create();
//        mDialog.show();
//    }



    private void setLocale(String lang) {
        // Save selected language to SharedPreferences
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("My_Lang", lang);
        editor.apply();
    }

    public void loadLocale() {
        SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefs.getString("My_Lang", "");
        setLocale(language); // Set the saved language
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(updateBaseContextLocale(base));
    }

    private Context updateBaseContextLocale(Context context) {
        SharedPreferences preferences = context.getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String lang = preferences.getString("My_Lang", ""); // Get the saved language
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);

        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);

        return context.createConfigurationContext(configuration);
    }
}
