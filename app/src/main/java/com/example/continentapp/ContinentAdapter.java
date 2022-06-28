package com.example.continentapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {
    private ArrayList<Continent> continents;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continents, OnItemClick onItemClick) {
        this.continents = continents;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continents.get(position));
        holder.itemView.setOnClickListener(view -> onItemClick.onItemClick(continents.get(position)));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    static class ContinentViewHolder extends RecyclerView.ViewHolder {
        private ImageView flag;
        private TextView continent;


        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            continent = itemView.findViewById(R.id.name);
        }

        public void bind(Continent continent) {
            this.continent.setText(continent.getName());
            Glide.with(flag).load(continent.getImage()).into(flag);
        }
    }
}
