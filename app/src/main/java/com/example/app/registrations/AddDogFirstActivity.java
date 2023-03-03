package com.example.app.registrations;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.apptest.R;

public class AddDogFirstActivity extends AppCompatActivity {
    Button addYourDogButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d1_add_dog_first_activity);


        addYourDogButton = findViewById(R.id.addYourDogButton);
        addYourDogButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddDogFirstActivity.this, AddDogSecondActivity.class);
                startActivity(intent);
            }
        });
    }


}
