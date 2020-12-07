package com.example.recycler;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class RoomTypeSelection {

    int image;
    String title;
    GradientDrawable color;

    public RoomTypeSelection(GradientDrawable color, int image, String title) {
        this.image = image;
        this.title = title;
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }


    public Drawable getgradient() {
        return color;
    }


}
