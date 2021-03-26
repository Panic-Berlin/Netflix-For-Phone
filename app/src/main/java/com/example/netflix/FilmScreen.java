package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FilmScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.film_screen);
        getSupportActionBar().hide();
    }
}