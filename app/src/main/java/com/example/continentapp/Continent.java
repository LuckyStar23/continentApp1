package com.example.continentapp;

import android.graphics.drawable.Drawable;

public class Continent {
    private String name;
    private Drawable image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public Continent(String name, Drawable image) {
        this.name = name;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}




