package com.example.moving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.first);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("firstName" , "Majid");
                intent.putExtra("lastName" , "Saqr");
                intent.putExtra("Age" , 21);
                intent.putExtra("section" , "Computer Science");
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this , MainActivity3.class));
            }
        });
    }
}