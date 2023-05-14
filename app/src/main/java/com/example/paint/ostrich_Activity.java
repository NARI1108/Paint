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

        img_show.setImageResource(ids_ostrich[0]);
        txt_step_show.setText((counter+1) +"from"+ ids_ostrich.length);
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
            txt_step_show.setText((counter+1) +"from"+ ids_ostrich.length);
        } else if ( id == R.id.btn_prev) {
            counter--;
            if(counter < 0){
                counter = ids_ostrich.length - 1;
            }
            img_show.setImageResource(ids_ostrich[counter]);
            txt_step_show.setText((counter+1) +"from"+ ids_ostrich.length);
        }
    }
  }
