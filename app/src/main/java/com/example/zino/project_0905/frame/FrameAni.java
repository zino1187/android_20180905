package com.example.zino.project_0905.frame;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.zino.project_0905.R;

public class FrameAni extends AppCompatActivity{

    int[] images={
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13,
        R.drawable.image14,
        R.drawable.image15,
        R.drawable.image16,
        R.drawable.image17,
        R.drawable.image18
    };
    BitmapDrawable[] frames=new BitmapDrawable[images.length];
    AnimationDrawable animationDrawable;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.frame_ani);


        Resources res = this.getResources();
        animationDrawable = new AnimationDrawable();

        animationDrawable.setOneShot(false); /*한번만 수행하지 않겠다*/
        for(int i=0;i<18;i++) {
            frames[i] = (BitmapDrawable) res.getDrawable(images[i],null);
            animationDrawable.addFrame(frames[i],50);
        }

        ImageView img=(ImageView) findViewById(R.id.img);
        img.setBackground(animationDrawable);
        animationDrawable.start();
        animationDrawable.setVisible(true ,true);
    }


}
