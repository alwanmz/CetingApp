package com.example.cetingapp;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Fitur7_1Activity extends AppCompatActivity {
    VideoView Vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitur71);
        Vid = findViewById(R.id.vidplay);
        MediaController mediaController = new MediaController(this);
        mediaController.setMediaPlayer(Vid);
        Vid.setMediaController(mediaController);
        Vid.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoplayback));
        Vid.start();
    }
}