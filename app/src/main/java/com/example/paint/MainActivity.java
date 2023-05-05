package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_list, btn_abt_us, btn_cnt_us, btn_ext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_list = findViewById(R.id.btn_list);
        btn_abt_us = findViewById(R.id.btn_abt_us);
        btn_cnt_us = findViewById(R.id.btn_cnt_us);
        btn_ext = findViewById(R.id.btn_ext);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_rotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        Animation animation_scale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        Animation animation_trans_right = AnimationUtils.loadAnimation(this,R.anim.anim_trans_right);
        Animation animation_trans_left = AnimationUtils.loadAnimation(this,R.anim.anim_trans_left);
        btn_list.setAnimation(animation_trans_right);
        btn_abt_us.setAnimation(animation_trans_left);
        btn_cnt_us.setAnimation(animation_trans_right);
        btn_ext.setAnimation(animation_trans_left);
    }
}