package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class infoActivity extends AppCompatActivity {

    private TextView name, job , age;
    private Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = findViewById(R.id.name);
        job = findViewById(R.id.age);
        age = findViewById(R.id.info);

        bundle = getIntent().getExtras();

        if(bundle != null)
        {
            name.setText(bundle.getString("name"));
            job.setText(bundle.getString("job"));
            age.setText(bundle.getString("age"));
        }
    }
}