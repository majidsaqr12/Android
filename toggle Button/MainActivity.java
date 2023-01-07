package com.example.tooglebutton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt);
        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener((compoundButton, b) -> {
            if(b)
            {
                txt.setVisibility(View.VISIBLE);
                txt.setText("Wifi On");
            }
            else
            {
                txt.setVisibility(View.INVISIBLE);
            }
        });
    }
}