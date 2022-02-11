package com.example.android3lesson1;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android3lesson1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    CounterPresenter presenter;
    CounterModel counterModel = new CounterModel();
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.attachPresenter();
        presenter.attachView(this);
        initListeners();


    }

    private void initListeners() {
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
                presenter.changeColorAfterBoard();

            }
        });
        binding.btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
                presenter.changeColorAfterBoard();


            }
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.tvCount.setText(String.valueOf(count));


    }


    @Override
    public void setColor(int color) {
        binding.tvCount.setTextColor(presenter.counterModel.getColor());


    }
}