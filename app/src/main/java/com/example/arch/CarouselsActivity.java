package com.example.arch;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarouselsActivity extends AppCompatActivity implements CountryAdapter.OnCountryClickListener {

    private RecyclerView countriesRecyclerView;
    private RecyclerView citiesRecyclerView;
    private CountryAdapter countryAdapter;
    private CityAdapter cityAdapter;

    private Map<String, List<String>> countryCityMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carousels);

        countriesRecyclerView = findViewById(R.id.countriesRecyclerView);
        citiesRecyclerView = findViewById(R.id.citiesRecyclerView);

        // Initialize country-city mapping
        initializeCountryCityMap();

        List<String> countries = new ArrayList<>(countryCityMap.keySet());

        countryAdapter = new CountryAdapter(countries, this);
        cityAdapter = new CityAdapter(this, new ArrayList<>()); // Start with an empty list

        countriesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        countriesRecyclerView.setAdapter(countryAdapter);

        citiesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        citiesRecyclerView.setAdapter(cityAdapter);
    }

    private void initializeCountryCityMap() {
        countryCityMap = new HashMap<>();
        countryCityMap.put("Greece", Arrays.asList("Athens", "Patras", "Thessaloniki", "Corfu"));
        countryCityMap.put("Italy", Arrays.asList("Matera", "Maratea", "Assisi", "Perugia"));
        countryCityMap.put("Spain", Arrays.asList("Granada", "Zaragoza", "Murcia", "Santiago de Compostela"));
        countryCityMap.put("Cyprus", Arrays.asList("Nicosia", "Limassol", "Larnaka", "Paphos"));
    }

    @Override
    public void onCountryClick(String country) {
        List<String> cities = countryCityMap.get(country);
        if (cities != null) {
            cityAdapter = new CityAdapter(this, cities);
            citiesRecyclerView.setAdapter(cityAdapter);
        }
    }
}
