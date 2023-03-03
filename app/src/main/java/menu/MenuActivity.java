package menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.apptest.R;

public class MenuActivity extends AppCompatActivity {
        Button nutritionButton;
        Button wellnessButton;
        Button calendarButton;
        Button trainingButton;
        Button healthButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.e_menu_activity);


                nutritionButton = findViewById(R.id.nutritionButton);
                nutritionButton.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MenuActivity.this, MenuNutritionActivity.class);
                                startActivity(intent);
                        }
                });

                wellnessButton = findViewById(R.id.wellnessButton);
                wellnessButton.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MenuActivity.this, MenuWellnessActivity.class);
                                startActivity(intent);
                        }
                });

                calendarButton = findViewById(R.id.nutritionButton);
                calendarButton.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MenuActivity.this, MenuCalendarActivity.class);
                                startActivity(intent);
                        }
                });

                trainingButton = findViewById(R.id.trainingButton);
                trainingButton.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MenuActivity.this, MenuTrainingActivity.class);
                                startActivity(intent);
                        }
                });

                healthButton = findViewById(R.id.healthButton);
                healthButton.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(MenuActivity.this, MenuHealthActivity.class);
                                startActivity(intent);
                        }
                });
        }
}

