package com.example.android3lesson1;

public class CounterContracts {
    interface CounterView {
        void updateCounter(int count);

        void setColor(int color);
    }

    interface Presenter {
        void increment();

        void decrement();

        void attachView(CounterView counterView);

        void changeColorAfterBoard();
    }
}
