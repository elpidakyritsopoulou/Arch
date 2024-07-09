package com.example.arch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private List<String> countryList;
    private Map<String, Integer> countryImageMap;
    private OnCountryClickListener listener;

    public CountryAdapter(List<String> countryList, OnCountryClickListener listener) {
        this.countryList = countryList;
        this.listener = listener;
        initializeCountryImageMap();
    }

    private void initializeCountryImageMap() {
        countryImageMap = new HashMap<>();
        countryImageMap.put("Greece", R.drawable.athenscover);
        countryImageMap.put("Italy", R.drawable.italy);
        countryImageMap.put("Spain", R.drawable.spain);
        countryImageMap.put("Cyprus", R.drawable.cyprus);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String country = countryList.get(position);
        holder.countryName.setText(country);
        holder.countryImage.setImageResource(countryImageMap.get(country));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onCountryClick(country);
            }
        });
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView countryName;
        ImageView countryImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            countryName = itemView.findViewById(R.id.countryName);
            countryImage = itemView.findViewById(R.id.countryImage);
        }
    }

    public interface OnCountryClickListener {
        void onCountryClick(String country);
    }
}
