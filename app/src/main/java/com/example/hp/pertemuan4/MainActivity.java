package com.example.hp.pertemuan4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button luasB,calkulatorB,browserB,recycleviewB;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luasB = findViewById(R.id.luasB);
        calkulatorB = findViewById(R.id.calkulatorB);
        browserB = findViewById(R.id.browserB);
        recycleviewB = findViewById(R.id.recycleviewB);

        luasB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LuasActivity.class);
                startActivity(i);
            }
        });

        calkulatorB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(i);
            }
        });

        browserB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),BrowserActivity.class);
                startActivity(i);
            }
        });

        recycleviewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),RecycleviewActivity.class);
                startActivity(i);
            }
        });

        };
    }

