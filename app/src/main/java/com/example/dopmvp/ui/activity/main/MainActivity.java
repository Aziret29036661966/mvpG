package com.example.dopmvp.ui.activity.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dopmvp.R;
import com.example.dopmvp.ui.activity.main.presenter.Contract;

public class MainActivity extends AppCompatActivity implements Contract.ViewPresenter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError(String msg) {

    }

    @Override
    public void onProgress() {

    }

    @Override
    public void closeProgress() {

    }
}