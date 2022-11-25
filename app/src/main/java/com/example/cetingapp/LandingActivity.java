package com.example.cetingapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        CardView cardview1 = findViewById(R.id.card1);
        CardView cardview2 = findViewById(R.id.card2);
        CardView cardview3 = findViewById(R.id.card3);
        CardView cardview4 = findViewById(R.id.card4);
        CardView cardview5 = findViewById(R.id.card5);
        CardView cardview6 = findViewById(R.id.card6);
        CardView cardview7 = findViewById(R.id.card7);
        CardView cardview8 = findViewById(R.id.card8);

        cardview1.setOnClickListener(view -> openFitur1Activity());

        cardview2.setOnClickListener(view -> openFitur2Activity());

        cardview3.setOnClickListener(view -> openFitur3Activity());

        cardview4.setOnClickListener(view -> openFitur4Activity());

        cardview5.setOnClickListener(view -> openFitur5Activity());

        cardview6.setOnClickListener(view -> openFitur6Activity());

        cardview7.setOnClickListener(view -> openFitur7Activity());

        cardview8.setOnClickListener(view -> openFitur8Activity());

    }

    private void openFitur1Activity() {
        Intent intent = new Intent(this, Fitur1Activity.class);
        startActivity(intent);
    }

    private void openFitur2Activity() {
        Intent intent = new Intent(this, Fitur2Activity.class);
        startActivity(intent);
    }

    private void openFitur3Activity() {
        Intent intent = new Intent(this, Fitur3Activity.class);
        startActivity(intent);
    }

    private void openFitur4Activity() {
        Intent intent = new Intent(this, Fitur4Activity.class);
        startActivity(intent);
    }

    private void openFitur5Activity() {
        Intent intent = new Intent(this, Fitur5Activity.class);
        startActivity(intent);
    }

    private void openFitur6Activity() {
        Intent intent = new Intent(this, Fitur6Activity.class);
        startActivity(intent);
    }

    private void openFitur7Activity() {
        Intent intent = new Intent(this, Fitur7Activity.class);
        startActivity(intent);
    }

    private void openFitur8Activity() {
        Intent intent = new Intent(this, Fitur8Activity.class);
        startActivity(intent);
    }
}