package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    private EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        getSupportActionBar().hide();

        email = findViewById(R.id.user_email);
        password = findViewById(R.id.user_password);
    }

    public void onLoginClick(View view) {
        if (email.getText().toString().equals("") && password.getText().toString().equals("")){
            Toast.makeText(this, R.string.all_fields_must_be_filled, Toast.LENGTH_SHORT).show();
        }
        else {
            if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                Intent intent = new Intent(LoginScreen.this, MainScreen.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, R.string.incorrect_login_or_password, Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void onRegistrationClick(View view) {
        Intent intent = new Intent(LoginScreen.this, LogUpScreen.class);
        startActivity(intent);
    }
}