package com.example.j202046198;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
     LinearLayout baseLayout;
     EditText editNum1, editNum2;
     RadioButton rdoBtn1, rdoBtn2, rdoBtn3, rdoBtn4;
     Button result;

     ImageView jeju1, jeju2, jeju3,jeju4, jeju5,
             jeju6, jeju7, jeju8, jeju9, jeju10,
             jeju11, jeju12, jeju13, jeju14, jeju15;

     Button btnPrev, btnNext;

     LinearLayout colorChange;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("202046198 문서빈");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        editNum1 = (EditText) findViewById(R.id.editNum1);
        colorChange = (LinearLayout) findViewById(R.id.colorChange);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }
}