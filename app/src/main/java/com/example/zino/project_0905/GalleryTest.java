package com.example.zino.project_0905;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.zip.Inflater;

public class GalleryTest extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gallery);
        LinearLayout linear=(LinearLayout) findViewById(R.id.linear);

        /*setConentView 주석으로 막았으므로, 인플레이션 조차
        * 개발자가 직접해야 한다...*/
        LayoutInflater inflater=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);

        /*LayoutInflater 는 개발자가 지정한 xml 을 인플레이션 시켜줌
        * 인플레이션이란?  xml 에 명시한 tag 들을 안드로이드의 View 로 변환
        * 해주는 객체
        * */
        for(int i=0;i<10;i++) {
            View view=inflater.inflate(R.layout.gallery_item, linear, true);
            TextView txt=(TextView) view.findViewById(R.id.txt);
            txt.setText(i+"번째 히어로");
        }

        /*gallery.xml 이 인플레이션 된 이후에 ConstraintLayout 을 대상
        * 으로 해서 반복문 돌리자!!*/
        //ConstraintLayout layout=(ConstraintLayout) findViewById(R.id.layout);


    }
}









