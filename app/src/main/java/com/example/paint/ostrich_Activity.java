package com.example.paint;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ostrich_Activity extends base_Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        findViews();
        animation();
    }
    @Override
    protected void onResume() {
        music = MediaPlayer.create(ostrich_Activity.this,R.raw.music);
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
