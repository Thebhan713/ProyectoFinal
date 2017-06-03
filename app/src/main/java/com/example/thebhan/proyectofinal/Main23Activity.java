package com.example.thebhan.proyectofinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main23Activity extends AppCompatActivity {
    String url= "http://www.uniremington.edu.co/manizales/general/programas/semilleros.html";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        WebView web= (WebView) findViewById(R.id.webextension);
        web.setWebViewClient(new Main23Activity.MyWebViewClient());
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
