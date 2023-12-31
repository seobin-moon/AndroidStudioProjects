package com.example.hackerton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class login extends AppCompatActivity {
        TextView sign;

        @Override
        protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //회원가입 버튼
            sign = findViewById(R.id.signin);

            //회원가입 버튼 클릭시, 회원가입 페이지로 이동
            sign.setOnClickListener(v -> {
                Intent intent = new Intent(this, signup.class);
                startActivity(intent);
            });
        }
    }



}