package com.example.chatkara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIN extends AppCompatActivity {
    Button SignIn;
    TextView SignSkip, txtLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        SignIn = findViewById(R.id.btnSignIn);
        SignSkip = findViewById(R.id.SignSkip);
        txtLogin = findViewById(R.id.txtLogIn);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
        SignSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogIn();
            }
        });

    }

    private void openLogIn() {
        Intent intent = new Intent(SignIN.this, LogIN.class );
        startActivity(intent);
    }

    private void openMenu() {
        Intent intent = new Intent(SignIN.this, MainActivity.class );
        startActivity(intent);
    }
}