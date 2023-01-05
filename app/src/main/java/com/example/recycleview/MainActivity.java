package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.javaAdapter.RecycleAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycle;
    String[]country=new String[]{"one","two","three","four","five","six","saven","eight"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recycle=findViewById(R.id.recycle);

        LinearLayoutManager manager=new LinearLayoutManager(MainActivity.this);
        RecycleAdapter adapter=new RecycleAdapter(MainActivity.this,country);
        recycle.setLayoutManager(manager);
        recycle.setAdapter(adapter);

        LinearLayoutManager manager1=new LinearLayoutManager(MainActivity.this);
    }
}