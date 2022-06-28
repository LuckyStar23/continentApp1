package com.example.continentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.continentapp.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String continentName = getIntent().getStringExtra("key");
        switch (continentName) {
            case "Eurasia":
                loadEurasia();
                break;
            case "Africa":
                loadAfrica();
                break;
            case "South America":
                loadSA();
                break;
            case "North America":
                loadNA();
                break;
            case "Australia":
                loadAustralia();
                break;
            case "Antarctica":
                loadAntarctica();
                break;
        }
    }

    private void loadAntarctica() {
        binding.name1.setText("1");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_ceu));
        binding.name2.setText("2");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_ceu));
        binding.name3.setText("3");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_ceu));
        binding.name4.setText("4");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_ceu));
        binding.name.setText("5");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_ceu));
    }

    private void loadAustralia() {
        binding.name1.setText("Тонга");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_to));
        binding.name2.setText("Фиджи");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_fj));
        binding.name3.setText("Самоа");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_ws));
        binding.name4.setText("Палау");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_pw));
        binding.name.setText("Вануату");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_vu));
    }

    private void loadNA() {
        binding.name1.setText("Куба");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_cu));
        binding.name2.setText("Сша");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_us));
        binding.name3.setText("Канада");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_ca));
        binding.name4.setText("Мексика");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_mx));
        binding.name.setText("Гватемела");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_gt));
    }

    private void loadSA() {
        binding.name1.setText("Аргентина");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_ar));
        binding.name2.setText("Бразилия");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_br));
        binding.name2.setText("Чили");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_cl));
        binding.name4.setText("Уругвай");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_uy));
        binding.name.setText("Колумбия");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_co));
    }

    private void loadAfrica() {
        binding.name1.setText("Нигерия");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_ng));
        binding.name2.setText("Гана");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_gh));
        binding.name3.setText("Марокоо");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_ma));
        binding.name4.setText("Сенегал");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_sn));
        binding.name.setText("Танзания");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_tz));
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void loadEurasia() {
        binding.name1.setText("Казахстан");
        binding.flag1.setImageDrawable(getDrawable(R.drawable.ic_kz));
        binding.name2.setText("Россия");
        binding.flag2.setImageDrawable(getDrawable(R.drawable.ic_ru));
        binding.name3.setText("Кыргызстан");
        binding.flag3.setImageDrawable(getDrawable(R.drawable.ic_kg));
        binding.name4.setText("Узбекистан");
        binding.flag4.setImageDrawable(getDrawable(R.drawable.ic_uz));
        binding.name.setText("Таджикистан");
        binding.flag.setImageDrawable(getDrawable(R.drawable.ic_tj));
    }
}