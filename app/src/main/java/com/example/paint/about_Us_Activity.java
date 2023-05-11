package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class about_Us_Activity extends AppCompatActivity {
    TextView txt_header,  txt_material_about_us, txt_version;
    ImageView img_Icon;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        findViews();
        animation();
    }
    public void findViews(){
        txt_header = findViewById(R.id.txt_header);
        txt_material_about_us = findViewById(R.id.txt_material_about_us);
        img_Icon = findViewById(R.id.img_Icon);
        txt_version = findViewById(R.id.txt_version);
    }
    public void animation(){
        Animation animation_txt_header = AnimationUtils.loadAnimation(about_Us_Activity.this,R.anim.alpha);
        Animation animation_txt_material_about_us = AnimationUtils.loadAnimation(about_Us_Activity.this,R.anim.alpha);
        Animation animation_img_Icon = AnimationUtils.loadAnimation(about_Us_Activity.this,R.anim.anim_trans_left);
        Animation animation_txt_version = AnimationUtils.loadAnimation(about_Us_Activity.this,R.anim.anim_trans_right);

        txt_header.setAnimation(animation_txt_header);
        txt_material_about_us.setAnimation(animation_txt_material_about_us);
        img_Icon.setAnimation(animation_img_Icon);
        txt_version.setAnimation(animation_txt_version);
    }
}