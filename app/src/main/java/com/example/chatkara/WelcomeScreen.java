package com.example.chatkara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(WelcomeScreen.this, LogIN.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}