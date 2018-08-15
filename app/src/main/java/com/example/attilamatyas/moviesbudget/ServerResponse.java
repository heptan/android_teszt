package com.example.attilamatyas.moviesbudget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ImagesAdapter;

public class ServerResponse extends AppCompatActivity {
    private ImagesAdapter adapter;
    private RecyclerView imagesRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_response);

        imagesRV = (RecyclerView) findViewById(R.id.imagesRV);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        imagesRV.setLayoutManager(layoutManager);

        // TODO: add initial data fetch
        List<String> images = new ArrayList<>();
        images.add("https://images.unsplash.com/photo-1486758206125-94d07f414b1c?ixlib=rb-0.3.5&s=2bda5e189cbdf19185f03f310a88ae5b&auto=format&fit=crop&w=1950&q=80");
        images.add("https://images.unsplash.com/photo-1508881598441-324f3974994b?ixlib=rb-0.3.5&s=de7b102b9c6faa0b027644fcf35d37bc&auto=format&fit=crop&w=1050&q=80");
        images.add("https://images.unsplash.com/photo-1486570318579-054c95b01160?ixlib=rb-0.3.5&s=8cb4fb1b4ac3ab4e5335a6f5961d5d86&auto=format&fit=crop&w=1190&q=80");
        adapter = new ImagesAdapter(getApplicationContext(),images);
        imagesRV.setAdapter(adapter);
    }
}
