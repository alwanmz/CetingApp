package com.example.cetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Fitur2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur2);

        Button buttonX = findViewById(R.id.btnFaktorIn);
        Button buttonY = findViewById(R.id.btnFaktorEks);

        buttonX.setOnClickListener(view -> openFaktorIn());

        buttonY.setOnClickListener(view -> openFaktorEks());
    }

    private void openFaktorEks() {
        Intent intent = new Intent(this, Fitur2_2Activity.class);
        startActivity(intent);
    }

    private void openFaktorIn() {
        Intent intent = new Intent(this, Fitur2_1Activity.class);
        startActivity(intent);
    }
}