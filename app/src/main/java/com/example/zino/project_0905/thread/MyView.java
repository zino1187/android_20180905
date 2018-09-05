package com.example.zino.project_0905.thread;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.zino.project_0905.R;

public class MyView extends View{
    Resources res;
    Paint paint;
    Bitmap bitmap;
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
    Thread thread;
    Handler handler;
    int count=0;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        res=context.getResources();
        paint = new Paint();

        handler=new Handler(){
            public void handleMessage(Message msg) {
                reDraw();
            }
        };

        thread = new Thread(){
            public void run() {
                while(true) {
                    handler.sendEmptyMessage(0);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();
    }

    public void reDraw(){
        this.invalidate();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }

    @Override
    protected void onDraw(Canvas canvas) {
        bitmap=BitmapFactory.decodeResource(res, images[count]);
        canvas.drawBitmap(bitmap, 100,100, paint);
        count++;
        if(count >=images.length){
            count=0;
        }
    }

}
