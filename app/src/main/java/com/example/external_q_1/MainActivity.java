package com.example.external_q_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    private Button btn_up,btn_down,btn_left,btn_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img =findViewById(R.id.img);

        SpringAnimation springAnimationY = new SpringAnimation(img, DynamicAnimation.TRANSLATION_Y,0f);
        springAnimationY.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_HIGH_BOUNCY);
        springAnimationY.getSpring().setStiffness(SpringForce.STIFFNESS_LOW);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                springAnimationY.animateToFinalPosition(800f);
            }
        });

        DynamicAnimation.OnAnimationEndListener endListener = new DynamicAnimation.OnAnimationEndListener(){

            @Override
            public void onAnimationEnd(DynamicAnimation animation, boolean canceled, float value, float velocity) {
                springAnimationY.animateToFinalPosition(0f);
            }
        };
        springAnimationY.addEndListener(endListener);

        FlingAnimation flingAnimation = new FlingAnimation(img,DynamicAnimation.ROTATION_X);

        flingAnimation.setStartVelocity(2000f);
        flingAnimation.setFriction(1.5f);
        flingAnimation.setMinValue(0f);
        flingAnimation.setMaxValue(1000f);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flingAnimation.start();
            }
        });


        btn_up = findViewById(R.id.btn_up);
        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.flip_animation);
                img.startAnimation(animation);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_animation);
                img.startAnimation(animation1);
            }
        });

        btn_down = findViewById(R.id.btn_down);
        btn_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.flip_animation);
                img.startAnimation(animation);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_animation);
                img.startAnimation(animation1);
            }
        });

        btn_left = findViewById(R.id.btn_left);
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.flip_animation);
                img.startAnimation(animation);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_animation);
                img.startAnimation(animation1);
            }
        });

        btn_right = findViewById(R.id.btn_right);
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.flip_animation);
                img.startAnimation(animation);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.slide_animation);
                img.startAnimation(animation1);
            }
        });
    }
}