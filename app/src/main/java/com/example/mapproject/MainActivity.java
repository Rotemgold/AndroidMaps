package com.example.mapproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button moveToMap;
    private Button nevigateBtn;
    private Button nearbyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nevigateBtn =(Button)findViewById(R.id.nevigationbtn);
        nevigateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,Nevigation.class);
                startActivity(i);
            }
        });

        nearbyBtn =(Button)findViewById(R.id.nearbybtn);
        nearbyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i);
            }
        });
    }
}