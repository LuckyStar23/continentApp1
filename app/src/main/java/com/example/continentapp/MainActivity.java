package com.example.continentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.security.Key;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClick {
    private static final String KEY_FOR_INTENT = "key";
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;
    private ContinentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        initRecycler();
    }

    private void initRecycler() {
        adapter = new ContinentAdapter(continents, this);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
    }


    @SuppressLint("UseCompatLoadingForDrawables")
    private void loadData() {
        continents = new ArrayList<>();
        continents.add(new Continent("Eurasia", getDrawable(R.drawable.ic_eurasia)));
        continents.add(new Continent("Africa", getDrawable(R.drawable.ic_ng)));
        continents.add(new Continent("South America", getDrawable(R.drawable.ic_ar)));
        continents.add(new Continent("North America", getDrawable(R.drawable.ic_us)));
        continents.add(new Continent("Australia", getDrawable(R.drawable.ic_pw)));
        continents.add(new Continent("Antarctica", getDrawable(R.drawable.ic_ceu)));
    }

    @Override
    public void onItemClick(Continent continent) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra(KEY_FOR_INTENT, continent.getName());
        startActivity(intent);
    }
}


