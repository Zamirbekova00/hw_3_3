package com.example.hw_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String > countryList;
    private CountryAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_country);
        loadData();
        adapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countryList = new ArrayList<>();
        countryList.add("Kyrgyzstan");
        countryList.add("Russia");
        countryList.add("Kazakhstan");
        countryList.add("China");
        countryList.add("Turkey");
        countryList.add("Germany");
        countryList.add("Uzbekistan");
        countryList.add("Sri Lanka");
        countryList.add("Yugoslavia");
        countryList.add("America");
        countryList.add("India");
        countryList.add("Australia");
        countryList.add("France");
        countryList.add("Canada");
        countryList.add("Colombia");
        countryList.add("Estonia");
        countryList.add("Iran");
        countryList.add("Madagascar");
        countryList.add("Nepal");
        countryList.add("Peru");
    }
}