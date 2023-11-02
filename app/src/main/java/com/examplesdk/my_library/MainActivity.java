package com.examplesdk.my_library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.examplesdk.toaster.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.showToast(this,"hahaha",500);
    }
}