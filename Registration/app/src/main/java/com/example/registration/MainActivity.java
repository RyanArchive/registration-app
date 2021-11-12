package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.registration.MESSAGE";
    private  EditText etMainFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMainFirstName = findViewById(R.id.etMainFirstName);
        EditText etMainLastName = findViewById(R.id.etMainLastName);
        EditText etMainUsername = findViewById(R.id.etMainUsername);
        EditText etMainPassword = findViewById(R.id.etMainPassword);
        EditText etMainConfirmPassword = findViewById(R.id.etMainConfirmPassword);
    }

    public void register(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String firstName = etMainFirstName.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, firstName);
        startActivity(intent);
    }
}