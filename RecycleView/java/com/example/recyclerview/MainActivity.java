package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Listitem> listItem;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.resyclerviewid);
        recyclerView.setHasFixedSize(true);  // good Space
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItem = new ArrayList<Listitem>();
        Listitem item1 = new Listitem("Majid" , "Java Developer" , "21");
        Listitem item2 = new Listitem("Muhamed" , "Doctor" , "48");
        Listitem item3 = new Listitem("Saqr" , "Android" , "50");
        listItem.add(item1);
        listItem.add(item2);
        listItem.add(item3);
        adapter = new MyAdapter(this , listItem);
        recyclerView.setAdapter(adapter);
    }
}