package com.example.cetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Fitur7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur7);

        Button button1 = findViewById(R.id.btnRef1);
        Button button2 = findViewById(R.id.btnRef2);

        button1.setOnClickListener(view -> openVid());
        button2.setOnClickListener(view -> openDoc());
    }

    private void openDoc() {
        Intent intent = new Intent(this, Fitur7_3Activity.class);
        startActivity(intent);
    }

    private void openVid() {
        Intent intent = new Intent(this, Fitur7_1Activity.class);
        startActivity(intent);
    }
}