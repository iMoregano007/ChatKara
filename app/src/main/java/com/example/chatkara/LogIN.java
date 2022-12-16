package com.example.chatkara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LogIN extends AppCompatActivity {
    Button LogIn;
    TextView loginSkip, txtsignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        LogIn = findViewById(R.id.btnLogIn);
        loginSkip = findViewById(R.id.LoginSkip);
        txtsignIn = findViewById(R.id.txtSignIn);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
        loginSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
        txtsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignIn();
            }
        });

    }

    private void openSignIn() {
        Intent intent = new Intent(LogIN.this , SignIN.class);
        startActivity(intent);
    }

    private void openMenu() {
        Intent intent = new Intent(LogIN.this, MainActivity.class );
        startActivity(intent);
    }
}