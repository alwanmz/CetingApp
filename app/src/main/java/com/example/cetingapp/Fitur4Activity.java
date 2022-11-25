package com.example.cetingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Fitur4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur4);

        Button buttonA = findViewById(R.id.btnDPen);
        Button buttonB = findViewById(R.id.btnDPan);

        buttonA.setOnClickListener(view -> openDPen());

        buttonB.setOnClickListener(view -> openDPan());
    }
    private void openDPen() {
        Intent intent = new Intent(this, Fitur4_1Activity.class);
        startActivity(intent);
    }

    private void openDPan() {
        Intent intent = new Intent(this, Fitur4_2Activity.class);
        startActivity(intent);
    }
}
