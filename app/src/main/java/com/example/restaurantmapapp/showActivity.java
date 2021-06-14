package com.example.restaurantmapapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Button getLocationBtn = findViewById(R.id.getLocationButton);
        Button showOnMapBtn = findViewById(R.id.showOnMapButton);
        TextView place = findViewById(R.id.locationText);

        getLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placeIntent = new Intent(showActivity.this,locationActivity.class);
                startActivity(placeIntent);
            }
        });

        showOnMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent (showActivity.this, MapsActivity.class);
                startActivity(mapIntent);
            }
        });
    }
}