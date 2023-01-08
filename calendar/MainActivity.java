package com.example.calendar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(i + " / ");
                stringBuilder.append(i1 + 1 + " / ");
                stringBuilder.append(i2);

                Toast.makeText(MainActivity.this, stringBuilder, Toast.LENGTH_SHORT).show();
            }
        });
    }
}