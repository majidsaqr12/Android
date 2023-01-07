package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    CheckBox java;
    CheckBox c;
    CheckBox py;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.txt);
        java = findViewById(R.id.java);
        c = findViewById(R.id.c);
        py = findViewById(R.id.py);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                if(java.isChecked())
                {
                    stringBuilder.append(java.getText() + "\n");
                }
                if(c.isChecked())
                {
                    stringBuilder.append(c.getText() + "\n");
                }
                if(py.isChecked())
                {
                    stringBuilder.append(py.getText() + "\n");
                }
                txt.setVisibility(View.VISIBLE);
                txt.setText(stringBuilder);
            }
        });
    }
}