package com.example.netflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LogUpScreen extends AppCompatActivity {

    private EditText firstName, lastName, email, password, passwordCopy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_up_screen);
        getSupportActionBar().hide();
        firstName = findViewById(R.id.user_firstName);
        lastName = findViewById(R.id.user_lastName);
        email = findViewById(R.id.user_reg_email);
        password = findViewById(R.id.user_passwordRegistration);
        passwordCopy = findViewById(R.id.user_copyPassword);
    }

    public void onAccClick(View view) {
        Intent intent = new Intent(LogUpScreen.this, LoginScreen.class);
        startActivity(intent);
    }

    public void onNewRegistrationClick(View view) {
        if (firstName.getText().toString().equals("") || lastName.getText().toString().equals("") ||
        email.getText().toString().equals("") || password.getText().toString().equals("") || passwordCopy.getText().toString().equals("")){
            Toast.makeText(this, R.string.all_fields_must_be_filled, Toast.LENGTH_SHORT).show();
        }else {

            if (passwordCopy.getText().toString().equals(password.getText().toString())){
                Intent intent = new Intent(LogUpScreen.this, MainScreen.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, R.string.password_mismatch, Toast.LENGTH_SHORT).show();
            }
        }

    }
}