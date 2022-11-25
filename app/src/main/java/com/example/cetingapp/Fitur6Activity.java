package com.example.cetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class Fitur6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur6);

        Button buttonw = findViewById(R.id.btnPandu);

        buttonw.setOnClickListener(view -> openPandu());

    }

    private void openPandu() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YQVayZhXACjwgQqJcrWymWxfEREM4G5Y/view?usp=sharing"));
        startActivity(intent);

    }
}