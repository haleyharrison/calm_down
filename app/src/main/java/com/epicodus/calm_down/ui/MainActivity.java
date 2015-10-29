package com.epicodus.calm_down.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.calm_down.debugActivity;
import com.epicodus.calm_down.geoActivity;
import com.epicodus.calm_down.R;
import com.epicodus.calm_down.ottersActivity;

public class MainActivity extends AppCompatActivity {

    private Button mDebugButton;
    private Button mOttersButton;
    private Button mGeoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDebugButton = (Button) findViewById(R.id.debugButton);
        mOttersButton = (Button) findViewById(R.id.ottersButton);
        mGeoButton = (Button) findViewById(R.id.geoButton);


        mDebugButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, debugActivity.class);
                startActivity(intent);
            }
        });

        mOttersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ottersActivity.class);
                startActivity(intent);
            }
        });

        mGeoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, geoActivity.class);
                startActivity(intent);
            }
        });

        }

    }


