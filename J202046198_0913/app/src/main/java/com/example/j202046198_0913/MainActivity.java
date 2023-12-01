// 2장 p.99
package com.example.j202046198_0913;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
//    private Bundle savedInstanceState;  -> ?? 뭔말이지

    @Override // 이미 정의된 메소드를 다시 갖다 씀
    protected void onCreate(Bundle savedInstanceState) { // onCreate()은 가장 먼저 시작되는 메소드
        this.savedInstanceState = savedInstanceState; // onCreate를 재정의함
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // activity_main.xml을 화면에 표시하라는 의미.

        button1 btn = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setText("클릭했음");
                btn.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요",
                        Toast.LENGTH_SHORT).show();
            }
        }); //set은 기능을 주기 위함
    }
}