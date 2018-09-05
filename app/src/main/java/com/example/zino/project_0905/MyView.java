package com.example.zino.project_0905;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class MyView extends View{
    String TAG=this.getClass().getName();

    Canvas canvas;
    Paint paint;
    int velX=1,velY=1;
    Handler handler;
    int x=100,y=100;
    int width=100;
    int height=100;

    Rect r;

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        Handler hanlder;
        r=new Rect(x,y,x+width,y+height);

        handler = new Handler(){
            public void handleMessage(Message msg) {
                tick();
            }
        };


        Thread thread = new Thread(){
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.sendEmptyMessage(0);
                }
            }
        };

        thread.start();
    }

    public void tick(){
        x=x+velX;
        y=y+velY;

        Log.d(TAG, "x is " + x+", y is "+y);

        this.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.canvas=canvas;

        r.set(x,y,x+width ,y+height);

        canvas.drawRect(r,paint);

    }
}
