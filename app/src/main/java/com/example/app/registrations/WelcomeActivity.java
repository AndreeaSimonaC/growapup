package com.example.app.registrations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.apptest.R;

public class WelcomeActivity extends AppCompatActivity {
    private static final int DELAY_TIME = 4000;
    private TextView textViewWelcome;
    private TextView textViewAbout;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_welcome_activity);
        textViewWelcome = findViewById(R.id.textViewWelcome);
        textViewAbout = findViewById(R.id.textViewAbout);

        textViewAbout.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @SuppressLint("ResourceType")
            @Override
            public void run() {
                textViewWelcome.setVisibility(View.GONE);
                textViewAbout.setVisibility(View.VISIBLE);
            }

        }, DELAY_TIME);


        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}