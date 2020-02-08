package com.example.wellocity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonToSell;
    RecyclerView recyclerView;
    ArrayList<com.example.wellocity.MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //go to sell page
        buttonToSell = findViewById(R.id.buttonToSell);
        buttonToSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitySell.class);
                startActivity(intent);
                finish();
            }
        });




        //for Main Home Page , recyclerView ID = recycler_view

        recyclerView = findViewById(R.id.recycler_view);

        Integer [] medLogo = {R.drawable.meds, R.drawable.med, R.drawable.medse};
        String [] medName = {"Sell Meds", "Donate Meds", "Buy meds"};

        mainModels = new ArrayList<>();
        for (int i=0; i<medLogo.length; i++){
            com.example.wellocity.MainModel model = new com.example.wellocity.MainModel(medLogo[i], medName[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mainAdapter = new com.example.wellocity.MainAdapter(this, mainModels);
        recyclerView.setAdapter(mainAdapter);
    }



    }

