package com.example.zane.animationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_animation_resources)
    Button btnAnimationResources;
    @BindView(R.id.btn_activity_transition)
    Button btnActivityTransition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnAnimationResources.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityAnimationResources.class);
            startActivity(intent);
        });

        btnActivityTransition.setOnClickListener(v -> {
            startActivity(new Intent(this, ActivityTransitionAnimation.class));
            overridePendingTransition(R.anim.anim_slide_up_in, R.anim.anim_slide_up_out);
        });
    }
}
