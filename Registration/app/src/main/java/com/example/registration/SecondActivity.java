package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView tvSecondMessage = findViewById(R.id.tvSecondMessage);
        tvSecondMessage.setText("Welcome, " + firstName + "!");
    }
}