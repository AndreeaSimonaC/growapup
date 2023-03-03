package com.example.app.registrations;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptest.R;

import menu.MenuActivity;

public class AddDogSecondActivity extends AppCompatActivity {

    Button doneRegisteringDog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d2_add_dog_second_activity);

        doneRegisteringDog = findViewById(R.id.doneRegisteringDog);
        doneRegisteringDog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDogSecondActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
