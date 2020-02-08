package com.example.wellocity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivitySell extends AppCompatActivity {
    private static final String TAG = "MainActivitySell";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sell);

        initImageBitmaps();
    }

    // to go back to home


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivitySell.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://image.shutterstock.com/image-vector/medicine-icon-600w-602649194.jpg");
        mNames.add("Muscle Pain");

        mImageUrls.add("https://image.shutterstock.com/z/stock-photo-pills-syringe-and-thermometer-for-treatment-lie-on-a-white-background-1555769816.jpg");
        mNames.add("Antibiotics");

        mImageUrls.add("https://image.shutterstock.com/z/stock-photo-pills-syringe-and-thermometer-for-treatment-lie-on-a-white-background-1555769816.jpg");
        mNames.add("Digestive Issues");

        mImageUrls.add("https://image.shutterstock.com/image-vector/medicine-icon-600w-602649194.jpg");
        mNames.add("Contraceptives");


        mImageUrls.add("https://image.shutterstock.com/image-vector/medicine-icon-600w-602649194.jpg");
        mNames.add("Pain killers");

        mImageUrls.add("https://image.shutterstock.com/z/stock-photo-pills-syringe-and-thermometer-for-treatment-lie-on-a-white-background-1555769816.jpg");
        mNames.add("Mild fever");


        mImageUrls.add("https://image.shutterstock.com/z/stock-photo-pills-syringe-and-thermometer-for-treatment-lie-on-a-white-background-1555769816.jpg");
        mNames.add("Cough-cold");

        mImageUrls.add("https://image.shutterstock.com/image-vector/medicine-icon-600w-602649194.jpg");
        mNames.add("Viral fever");

        mImageUrls.add("https://image.shutterstock.com/image-vector/medicine-icon-600w-602649194.jpg");
        mNames.add("Headaches");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: initializing staggered recycler view");

        RecyclerView recyclerView = findViewById(R.id.recycler_view_sell);
        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter = new StaggeredRecyclerViewAdapter(this, mNames, mImageUrls);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);


    }

}
