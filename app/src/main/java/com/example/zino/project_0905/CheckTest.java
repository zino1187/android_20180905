package com.example.zino.project_0905;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckTest extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.check);

        CheckBox ch1=(CheckBox) findViewById(R.id.ch1);
        CheckBox ch2=(CheckBox) findViewById(R.id.ch2);

        /*리스너와 연결*/
        ch1.setOnCheckedChangeListener(this);
        ch2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("CheckTest","체크상태는 "+isChecked);
    }
}
