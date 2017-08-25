package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView viewWhereToGo = (TextView) findViewById(R.id.category_where_to_go);
        TextView viewWhereToEat = (TextView) findViewById(R.id.category_where_to_eat);
        TextView viewWhereToStay = (TextView) findViewById(R.id.category_where_to_stay);
        TextView viewWhatToCelebrate = (TextView) findViewById(R.id.category_what_to_celebrate);

        viewWhereToGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whereToGoIntent = new Intent(MainActivity.this, WhereToGoActivity.class);
                startActivity(whereToGoIntent);
            }
        });

        viewWhereToEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whereToEatIntent = new Intent(MainActivity.this, WhereToEatActivity.class);
                startActivity(whereToEatIntent);
            }
        });

        viewWhereToStay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whereToStayIntent = new Intent(MainActivity.this, WhereToStayActivity.class);
                startActivity(whereToStayIntent);
            }
        });

        viewWhatToCelebrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whatToCelebrateIntent = new Intent(MainActivity.this, WhatToCelebrateActivity.class);
                startActivity(whatToCelebrateIntent);
            }
        });
    }
}
