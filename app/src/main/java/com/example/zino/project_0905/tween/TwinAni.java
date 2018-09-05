package com.example.zino.project_0905.tween;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.zino.project_0905.R;

public class TwinAni extends AppCompatActivity{
    ImageView img;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tween);
        img=findViewById(R.id.hero);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.scale);
        img.startAnimation(animation);
        return super.onTouchEvent(event);
    }
}
