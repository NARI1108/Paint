package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class contact_Us_Activity extends AppCompatActivity {
    ImageView img_Phone, img_Eitaa, img_telegram;
    TextView   txt_number, txt_material_contact, txt_header, txt_eitaa, txt_telegram;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        img_Phone = findViewById(R.id.img_Phone);
        txt_number = findViewById(R.id.txt_number);
        txt_material_contact = findViewById(R.id.txt_material_contact);
        img_Eitaa = findViewById(R.id.img_Eitaa);
        txt_header = findViewById(R.id.txt_header);
        txt_eitaa  = findViewById(R.id.txt_eitaa);
        img_telegram = findViewById(R.id.img_telegram);
        txt_telegram = findViewById(R.id.txt_telegram);

        Animation animation_img_phone = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_left);
        Animation animation_txt_number = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_right);
        Animation animation_txt_material_contact = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.alpha);
        Animation animation_img_eitaa = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_left);
        Animation animation_txt_header = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.alpha);
        Animation animation_txt_eitaa  = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_right);
        Animation animation_img_telegram = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_left);
        Animation animation_txt_telegram = AnimationUtils.loadAnimation(contact_Us_Activity.this,R.anim.anim_trans_right);

        img_Phone.setAnimation(animation_img_phone);
        txt_number.setAnimation(animation_txt_number);
        txt_material_contact.setAnimation(animation_txt_material_contact);
        img_Eitaa.setAnimation(animation_img_eitaa);
        txt_header.setAnimation(animation_txt_header);
        txt_eitaa.setAnimation(animation_txt_eitaa);
        img_telegram.setAnimation(animation_img_telegram);
        txt_telegram.setAnimation(animation_txt_telegram);
    }
}