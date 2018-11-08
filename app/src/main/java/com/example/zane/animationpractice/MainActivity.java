package com.example.zane.animationpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_animation_resources)
    Button btnAnimationResources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnAnimationResources.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityAnimationResources.class);
            startActivity(intent);
        });
    }
}
