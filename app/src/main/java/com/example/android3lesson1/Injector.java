package com.example.android3lesson1;

public class Injector {
    public static CounterPresenter attachPresenter() {
        return new CounterPresenter();
    }
}
