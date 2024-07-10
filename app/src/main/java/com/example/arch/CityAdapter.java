package com.example.arch;

import android.content.Context;
import android.content.Intent;
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

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {

    private List<String> cityList;
    private Map<String, Integer> cityImageMap;
    private Context context;

    public CityAdapter(Context context, List<String> cityList) {
        this.context = context;
        this.cityList = cityList;
        initializeCityImageMap();
    }

    private void initializeCityImageMap() {
        cityImageMap = new HashMap<>();
        cityImageMap.put("Athens", R.drawable.athens1);
        cityImageMap.put("Thessaloniki", R.drawable.thessaloniki);
        cityImageMap.put("Corfu", R.drawable.corfu);
        cityImageMap.put("Matera", R.drawable.matera);
        cityImageMap.put("Maratea", R.drawable.maratea);
        cityImageMap.put("Assisi", R.drawable.assisi);
        cityImageMap.put("Granada", R.drawable.granada);
        cityImageMap.put("Zaragoza", R.drawable.zaragoza);
        cityImageMap.put("Murcia", R.drawable.murcia);
        cityImageMap.put("Nicosia", R.drawable.nicosia);
        cityImageMap.put("Limassol", R.drawable.limassol);
        cityImageMap.put("Paphos", R.drawable.paphos);
        cityImageMap.put("Patra", R.drawable.patras);
        cityImageMap.put("Perugia", R.drawable.perugia);
        cityImageMap.put("Santiago de Compostela", R.drawable.santiago);
        cityImageMap.put("Larnaka", R.drawable.larnaka);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String city = cityList.get(position);
        holder.cityName.setText(city);

        Integer imageResource = cityImageMap.get(city);
        if (imageResource != null) {
            holder.cityImage.setImageResource(imageResource);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (city) {
                    case "Athens":
                        intent = new Intent(context, athens.class);
                        break;
                    case "Thessaloniki":
                        intent = new Intent(context, thessaloniki.class);
                        break;
                    case "Corfu":
                        intent = new Intent(context, corfu.class);
                        break;
                    case "Matera":
                        intent = new Intent(context, matera.class);
                        break;
                    case "Maratea":
                        intent = new Intent(context, maratea.class);
                        break;
                    case "Assisi":
                        intent = new Intent(context, assisi.class);
                        break;
                    case "Granada":
                        intent = new Intent(context, Granada.class);
                        break;
                    case "Zaragoza":
                        intent = new Intent(context, Zaragoza.class);
                        break;
                    case "Murcia":
                        intent = new Intent(context, Murcia.class);
                        break;
                    case "Nicosia":
                        intent = new Intent(context, nicosia.class);
                        break;
                    case "Limassol":
                        intent = new Intent(context, limassol.class);
                        break;
                    case "Paphos":
                        intent = new Intent(context, paphos.class);
                        break;
                    case "Patra":
                        intent = new Intent(context, patras.class);
                        break;
                    case "Perugia":
                        intent = new Intent(context, perugia.class);
                        break;
                    case "Santiago de Compostela":
                        intent = new Intent(context, Santiagocompostela.class);
                        break;
                    case "Larnaka":
                        intent = new Intent(context, Larnaka.class);
                        break;
                    default:
                        intent = null;
                        break;
                }
                if (intent != null) {
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityName;
        ImageView cityImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.cityName);
            cityImage = itemView.findViewById(R.id.cityImage);
        }
    }
}
