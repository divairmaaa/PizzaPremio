package com.example.divairmaa.pizzapremio;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class splash extends Activity {
    private static int splashInterval = 2500;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent i=new Intent(splash.this,navbar.class);
                startActivity(i);
                finish();
            }
        },splashInterval);
    }
}
