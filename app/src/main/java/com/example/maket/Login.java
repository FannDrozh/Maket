package com.example.maket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LogCongrats(View v)
    {
        Intent intent = new Intent(this, Congrats.class);
        startActivity(intent);
    }
    public void LogReg(View v)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}