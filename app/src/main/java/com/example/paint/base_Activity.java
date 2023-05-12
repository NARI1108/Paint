package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class base_Activity extends AppCompatActivity {
    Button btn_prev, btn_next, btn_start;
    TextView txt_step, txt_header;
    ImageView img_Music;
    boolean mute =true;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void findViews(){
        img_Music = findViewById(R.id.img_Music);
        txt_header = findViewById(R.id.txt_header);
        txt_step = findViewById(R.id.txt_step);
        btn_prev = findViewById(R.id.btn_prev);
        btn_next = findViewById(R.id.btn_next);
        btn_start= findViewById(R.id.btn_start);
    }
    public void animation(){
        Animation animation_img_Music  = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_txt_header = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_txt_step = AnimationUtils.loadAnimation(this,R.anim.anim_trans_bottom);
        Animation animation_btn_prev = AnimationUtils.loadAnimation(this,R.anim.anim_trans_bottom);
        Animation animation_btn_next = AnimationUtils.loadAnimation(this,R.anim.anim_trans_bottom);
        Animation animation_btn_start= AnimationUtils.loadAnimation(this,R.anim.anim_trans_bottom);

        img_Music.setAnimation(animation_img_Music);
        txt_header.setAnimation(animation_txt_header);
        btn_prev.setAnimation(animation_btn_prev);
        btn_next.setAnimation(animation_btn_next);
        btn_start.setAnimation(animation_btn_start);
        txt_step.setAnimation(animation_txt_step);
    }

    }
