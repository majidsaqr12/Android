package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    RadioGroup rg;
    RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        rg = (RadioGroup) findViewById(R.id.radio_group);

        rg.setOnCheckedChangeListener((radioGroup, i) -> {
            rb = findViewById(i);
            switch (rb.getId())
            {
                case R.id.pizza: {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Pizza");
                    break;
                }
                case R.id.burger: {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Burger");
                    break;
                }
                case R.id.steak: {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Steak");
                    break;
                }
                case R.id.pepsi: {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Pepsi");
                    break;
                }
                case R.id.cake: {
                    txt.setVisibility(View.VISIBLE);
                    txt.setText("Cake");
                    break;
                }
            }
        });
    }

//    public void radiobutton()
//    {
//        rb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String value = rb.getText().toString();
//                txt.setText(value);
//            }
//        });
//    }
}