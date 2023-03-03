package com.example.app.registrations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptest.R;

public class LoginActivity extends AppCompatActivity {
    Button doneLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c2_login_activity);

        doneLoginButton = findViewById(R.id.doneLoginButton);
        doneLoginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, AddDogFirstActivity.class);
                startActivity(intent);
            }
        });
    }
}

