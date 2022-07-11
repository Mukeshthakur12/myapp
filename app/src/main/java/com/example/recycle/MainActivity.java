package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  RecyclerView recyclerView;
  String[] mk={"hddd","hgddd","ddddgh","hdddh","jjjjj","jjjj","hgjhgjh","hgjhjh","kjjhjhhj","hyjh","ghfhffg","hh","hhhhh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(mk);
        recyclerView.setAdapter(c);

    }
}