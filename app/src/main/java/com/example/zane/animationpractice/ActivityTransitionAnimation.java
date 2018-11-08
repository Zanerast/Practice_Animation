package com.example.zane.animationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityTransitionAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_animation);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_slide_right_in, R.anim.anim_slide_right_out);
    }
}
