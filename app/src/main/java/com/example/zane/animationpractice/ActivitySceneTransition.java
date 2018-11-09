package com.example.zane.animationpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivitySceneTransition extends AppCompatActivity {

    @BindView(R.id.root_view)
    ViewGroup rootView;
    @BindView(R.id.btn_change_scene)
    Button btnSceneTransition;

    private Scene currentScene;
    private Scene scene1;
    private Scene scene2;
    private Transition transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scene_transition);

        ButterKnife.bind(this);

        scene1 = Scene.getSceneForLayout(rootView, R.layout.scene1, this);
        scene2 = Scene.getSceneForLayout(rootView, R.layout.scene2, this);

        transition = new ChangeBounds();
        transition.setDuration(DateUtils.SECOND_IN_MILLIS);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.go(scene1);
        currentScene = scene1;

        btnSceneTransition.setOnClickListener(v -> {
            if (currentScene == scene1) {
                TransitionManager.go(scene2, transition);
                currentScene = scene2;
            } else {
                TransitionManager.go(scene1, transition);
                currentScene = scene1;
            }
        });
    }

}
