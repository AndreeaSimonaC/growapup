package menu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.apptest.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenuCalendarActivity extends AppCompatActivity {

    Button backToMenuButton;
    Button addCalendarActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_menu_calendar);

        Calendar selectedDate;
        backToMenuButton = findViewById(R.id.backToMenuButton);
        backToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuCalendarActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        selectedDate = Calendar.getInstance();

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
             @Override
             public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                selectedDate.set(Calendar.YEAR, year);
                selectedDate.set(Calendar.MONTH, month);
                selectedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth);

             }
        });

        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String selectedDateString = dateFormat.format(selectedDate.getTime());

        addCalendarActivityButton = findViewById(R.id.addCalendarActivity);
        addCalendarActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuCalendarActivity.this, SymptomsActivity.class);
                intent.putExtra("selected_date", selectedDateString);
                startActivity(intent);
            }
        });


//        calendarView.setDate(System.currentTimeMillis());
//
//// Get the current date
//        Calendar calendar = Calendar.getInstance();
//        int currentYear = calendar.get(Calendar.YEAR);
//        int currentMonth = calendar.get(Calendar.MONTH);
//        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

    }
}
