package com.example.zino.project_0905;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*현재 클래스를 하나의 화면을 담당하는 클래스로 정의*/
public class EventTest extends AppCompatActivity implements View.OnClickListener{

    /*onCreate 현재 클래스를 초기화할때 하고 싶은 코드를 넣는
    * 영역 , 생명주기 메서드 중 하나....*/
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* event.xml 은 프로그래밍 언어가 아는 그냥 문서에 불과하므로
        * 실제적으로 자바의 객체가 되려면 아래의 메서드가 먼저 실행이
        * 되어야 한다..이때 xml 문서를 읽어들여 실제 안드로이드의
        * GUI 뷰를 만들어 내는 과정을 전문용어로 inflation 이라한다..*/
        setContentView(R.layout.event);

        /*setContentView 메서드가 호출된 이후에 Button이 메모리에
        * 올라왔으므로 이 시점부터는 id를 통해 버튼을 제어할 수 있다...
        * */

        /*document.getElementById 거의 동일...d*/
        Button bt=(Button)this.findViewById(R.id.bt);

        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("EventTest", "나 눌렀어?");
    }
}









