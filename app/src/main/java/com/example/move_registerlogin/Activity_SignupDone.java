package com.example.move_registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Activity_SignupDone extends AppCompatActivity {

    private TextView tv_nickname;
    private Button btn_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_done);

        tv_nickname = findViewById(R.id.tv_nickname);
        btn_start = findViewById(R.id.btn_start);

        Intent intent = getIntent();
        String userNickname = intent.getStringExtra("userNickname");

        tv_nickname.setText(userNickname+"님!");



    }
}