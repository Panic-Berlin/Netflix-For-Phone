package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MovieScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_screen);
        getSupportActionBar().hide();
    }
}