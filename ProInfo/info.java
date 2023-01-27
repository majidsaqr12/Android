package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class info extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView , textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = findViewById(R.id.imageView);
        textView2 = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            String name = bundle.getString("name");
            String info = bundle.getString("info");
            String key = bundle.getString("key");
            showinfo(name , info , key);
        }
    }

    public void showinfo(String name1 , String info1 , String key)
    {
        switch (key)
        {
            case "java":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.j1));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "js":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.js));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "c":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.c1));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "cPlus":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.c_plus1));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "python":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.py));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "php":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.phpp));
                textView2.setText(name1);
                textView.setText(info1);
                break;
            case "btn":
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.me));
                textView2.setText(name1);
                textView.setText(info1);
                break;
        }
    }
}