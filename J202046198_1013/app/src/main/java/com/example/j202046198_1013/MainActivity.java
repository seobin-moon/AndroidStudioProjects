package com.example.j202046198_1013;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (editText) findViewById(R.id.editTextText);
        btnGo = (Button) findViewById(R.id.button1);
        btnBack = (Button) findViewById(R.id.button2);
        web = (WebView) findViewById(R.id.webView1);

        WebSettings webSet = web.getSettings();
        webSet.
                webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);



    }

    private class ViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading
    }

}