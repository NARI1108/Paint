package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class list_Activity extends AppCompatActivity {
    ImageButton imgb_goat, imgb_ostrich, imgb_cow, imgb_chick, imgb_zebra, imgb_frog;

    TextView  txt_home_title, txt_header_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        imgb_goat = findViewById(R.id.imgb_goat);
        imgb_ostrich = findViewById(R.id.imgb_ostrich);
        imgb_cow = findViewById(R.id.imgb_cow);
        imgb_chick = findViewById(R.id.imgb_chick);
        imgb_zebra = findViewById(R.id.imgb_zebra);
        imgb_frog  = findViewById(R.id.imgb_frog);
        txt_home_title = findViewById(R.id.txt_home_title);
        txt_header_list = findViewById(R.id.txt_header_list);

        Animation animation_imgb_goat = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_left);
        Animation animation_imgb_ostrich = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_right);
        Animation animation_imgb_cow = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_left);
        Animation animation_imgb_chick = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_right);
        Animation animation_imgb_zebra = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_left);
        Animation animation_imgb_frog  = AnimationUtils.loadAnimation(list_Activity.this,R.anim.anim_trans_right);
        Animation animation_txt_home_title = AnimationUtils.loadAnimation(list_Activity.this,R.anim.alpha);
        Animation animation_txt_header     = AnimationUtils.loadAnimation(list_Activity.this,R.anim.alpha);

        imgb_goat.setAnimation(animation_imgb_goat);
        imgb_ostrich.setAnimation(animation_imgb_ostrich);
        imgb_cow.setAnimation(animation_imgb_cow);
        imgb_chick.setAnimation(animation_imgb_chick);
        imgb_zebra.setAnimation(animation_imgb_zebra);
        imgb_frog.setAnimation(animation_imgb_frog);
        txt_home_title.setAnimation(animation_txt_home_title);
        txt_header_list.setAnimation(animation_txt_header);

    }
    public void btns_click(View view){
          int id = view.getId();
          switch(id){
              case R.id.imgb_goat:startActivity(new Intent(list_Activity.this,goat_Activity.class));
                  break;
              case R.id.imgb_ostrich:startActivity(new Intent(list_Activity.this,ostrich_Activity.class));
                  break;

              case R.id.imgb_cow:
              case R.id.imgb_chick:
              case R.id.imgb_zebra:
              case R.id.imgb_frog:
                  Toast.makeText(this, "It will be updated soon.", Toast.LENGTH_SHORT).show();
                  break;
          }
    }
}