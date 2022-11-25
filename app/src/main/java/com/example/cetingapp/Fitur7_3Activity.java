package com.example.cetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class Fitur7_3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur73);

        Button buttoni = findViewById(R.id.btnBl);
        Button buttonj = findViewById(R.id.btnLf);

        buttoni.setOnClickListener(view -> openB());
        buttonj.setOnClickListener(view -> openL());
    }

    private void openL() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1X85OYLvRcU9CHnLFEIa3ogDgyRuwt3HI/view?usp=sharing"));
        startActivity(intent);
    }

    private void openB() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Xm7Qf_WLjkq1oIedstqeS093KNAsFPJ9/view?usp=sharing"));
        startActivity(intent);
    }

}