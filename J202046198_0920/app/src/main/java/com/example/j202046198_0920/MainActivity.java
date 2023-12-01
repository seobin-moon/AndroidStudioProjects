package com.example.j202046198_0920;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1, tv2, tv3; //위젯에 연결시키기 위해 변수 선언. textview 타입. tv1이라는 객체 생성.
        tv1 = (TextView) = findViewById(R.id.textView);
        tv2 = (TextView) = findViewById(R.id.textView2);
        tv3 = (TextView) = findViewById(R.id.textView3);

        Button mybutton;
        mybutton = (Button) findViewById(R.id.button);

        EditText editText1, editText2;
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        tv1.setText("안녕하세요..");
        tv1.setTextColor(Color.RED);

        tv2.setVisibility(View.GONE);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText1.getText()
            }
        });
    }
}