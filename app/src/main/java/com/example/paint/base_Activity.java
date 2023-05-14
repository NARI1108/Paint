package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class base_Activity extends AppCompatActivity {

    public int [] ids_goat={R.drawable.goat_1,R.drawable.goat_2,R.drawable.goat_3,R.drawable.goat_4};
    public int [] ids_ostrich={R.drawable.ostrich_1,R.drawable.ostrich_2,R.drawable.ostrich_3,R.drawable.ostrich_4,R.drawable.ostrich_5,R.drawable.ostrich_6};
    Button btn_prev, btn_next, btn_start;
    TextView txt_step, txt_header, txt_step_show;
    ImageView img_Music, img_show;
    boolean mute =true;
    MediaPlayer music;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void findViews(){
        txt_step_show = findViewById(R.id.txt_step_show);
        img_Music = findViewById(R.id.img_Music);
        txt_header = findViewById(R.id.txt_header);
        img_show = findViewById(R.id.img_show);
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
