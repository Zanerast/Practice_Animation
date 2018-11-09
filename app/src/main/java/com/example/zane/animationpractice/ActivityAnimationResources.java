package com.example.zane.animationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityAnimationResources extends AppCompatActivity {

    @BindView(R.id.btn_start_walking)
    Button btnStart;
    @BindView(R.id.iv_practice)
    ImageView ivPractice;

    Animation startAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_resources);
        ButterKnife.bind(this);

        startAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_resources_start);

        setupAnimationListener();

        btnStart.setOnClickListener(v -> {
            ivPractice.startAnimation(startAnimation);

        });
    }

    private void setupAnimationListener() {
        startAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation endAnimation = AnimationUtils.loadAnimation(ActivityAnimationResources.this, R.anim.anim_resources_end);
                ivPractice.startAnimation(endAnimation);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
