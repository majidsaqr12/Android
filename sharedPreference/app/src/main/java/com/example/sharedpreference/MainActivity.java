package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = findViewById(R.id.txtE);
        EditText password = findViewById(R.id.txtP);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(v -> {

            SharedPreferences preferences = getSharedPreferences("myKey" , 0);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("email" , email.getText().toString());
            editor.putString("password" , password.getText().toString());
            editor.apply();
        });

        SharedPreferences preferences = getSharedPreferences("myKey" , 0);

        if(preferences.contains("email") || preferences.contains("password"))
        {
            String myEmail = preferences.getString("email" , "");
            String myPassword = preferences.getString("password" , "");
            email.setText(myEmail);
            password.setText(myPassword);
        }
    }
}