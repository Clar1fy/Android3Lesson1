package com.example.android3lesson1;

import android.graphics.Color;

public class CounterModel {
    int count = 0;
    private int color;

    public int getColor() {
        return color;
    }

    void increment() {
        count++;

    }

    public int getCount() {
        return count;
    }

    void decrement() {
        count--;

    }

    void changeColor() {
        color = Color.GREEN;

    }

}

