package com.example.zane.animationpractice;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivityBackgroundAnimation extends AppCompatActivity {

    @BindView(R.id.btn_start_walking)
    Button btnBackgroundAnimation;

    boolean walking = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_animation);

        ButterKnife.bind(this);
        AnimationDrawable animationDrawable = (AnimationDrawable) btnBackgroundAnimation.getBackground();

        btnBackgroundAnimation.setOnClickListener(v -> {
            if (walking){
                btnBackgroundAnimation.setText(getString(R.string.stop_walking));
                animationDrawable.start();
                walking = false;
            } else {
                btnBackgroundAnimation.setText(getString(R.string.start_walking));
                animationDrawable.stop();
                walking = true;
            }

        });
    }
}
