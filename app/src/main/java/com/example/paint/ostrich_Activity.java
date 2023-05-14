package com.example.paint;


import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ostrich_Activity extends base_Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        findViews();
        animation();

        img_show.setImageResource(ids_ostrich[ids_ostrich.length-1]);
        txt_step_show.setText((counter+1) +getString(R.string.content_step_show)+ ids_goat.length);
        lin_buttons.setVisibility(View.INVISIBLE);
        lin_texts.setVisibility(View.INVISIBLE);
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
    @SuppressLint("SetTextI18n")
    public void btns_click(View view){
        int id = view.getId();
        if( id == R.id.img_Music){
            if(mute){
                music.pause();
                mute=false;
                img_Music.setImageResource(R.drawable.music_off);
            } else {
                music.start();
                mute=true;
                img_Music.setImageResource(R.drawable.music_on);
            }
        }else if ( id == R.id.btn_next) {
            counter++;
            if (counter == ids_ostrich.length) {
                counter = 0;
            }
            img_show.setImageResource(ids_ostrich[counter]);
            txt_step_show.setText((counter+1) +getString(R.string.content_step_show)+ ids_goat.length);
        } else if ( id == R.id.btn_prev) {
            counter--;
            if(counter < 0){
                counter = ids_ostrich.length - 1;
            }
            img_show.setImageResource(ids_ostrich[counter]);
            txt_step_show.setText((counter+1) +getString(R.string.content_step_show)+ ids_goat.length);
        }
    }
  }
