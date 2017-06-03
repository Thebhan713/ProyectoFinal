package com.example.thebhan.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main34Activity extends AppCompatActivity {
    String url= "biblioteca.uniremington.edu.co/index.php/login";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34);

        WebView web= (WebView) findViewById(R.id.webbibliotecauniremington);
        web.setWebViewClient(new Main34Activity.MyWebViewClient());
        WebSettings settings= web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl(url);
    }
    public class MyWebViewClient extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
