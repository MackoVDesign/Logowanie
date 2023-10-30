package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityHello2 extends AppCompatActivity {
    TextView helloMessageView;

    String login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hello);

        login = getIntent().getStringExtra("login");
        helloMessageView.setText("Hello" + login + "!");

    }
}