package menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.apptest.R;

public class SymptomsActivity extends AppCompatActivity {
    Button backToCalendarButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h1_menu_calendar_symptoms_activity);

        backToCalendarButton = findViewById(R.id.backToCalendarButton);
        backToCalendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SymptomsActivity.this, MenuCalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}