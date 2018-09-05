package com.example.zino.project_0905;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        /*xml이 좋은건 나도 안다....하지만, 고급개발자가 되기 위해서는
        * 순수한 자바코드만으로 개발할 줄 알아야 한다....*/
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);//수직방향으로..

        Button bt = new Button(this);
        bt.setWidth(100);
        bt.setHeight(100);
        bt.setText("자바코드로 붙인 버튼");

        layout.addView(bt);

        setContentView(layout);

    }
}







