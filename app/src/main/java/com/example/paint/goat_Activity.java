package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class goat_Activity extends AppCompatActivity {
    ImageView img_Music;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);

        findViews();
    }
     public void findViews(){
         img_Music = findViewById(R.id.img_Music);
     }

    @Override
    protected void onResume() {
        music = MediaPlayer.create(goat_Activity.this,R.raw.music);
        music.setLooping(true);
        music.start();
        super.onResume();
    }
    @Override
    protected void onPause() {
        music.release();
        super.onPause();
    }
}