package com.example.beyourowndoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BYOD extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_y_o_d);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        webView=findViewById(R.id.webpage);
        WebSettings webSettings=webView.getSettings();
       webSettings.setJavaScriptEnabled(true);

       webView.setWebViewClient(new WebViewClient());
       webView.loadUrl("https://www.facebook.com/BYOD-103530784595704/?modal=admin_todo_tour&notif_id=1583166380741957&notif_t=page_invite");
    }
}
