package com.epicodus.calm_down.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.epicodus.calm_down.EnrollActivity;
import com.epicodus.calm_down.NonProfitActivity;
import com.epicodus.calm_down.R;
import com.epicodus.calm_down.SponsorsActivity;

public class MainActivity extends AppCompatActivity {

    private Button mEnrollButton;
    private Button mSponsorsButton;
    private Button mNonProfitPartnersButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnrollButton = (Button) findViewById(R.id.debugButton);
        mSponsorsButton = (Button) findViewById(R.id.ottersButton);
        mNonProfitPartnersButton = (Button) findViewById(R.id.geoButton);

        mNonProfitPartnersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, NonProfitActivity.class);
                startActivity(intent);
            }
        });

        mEnrollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EnrollActivity.class);
                startActivity(intent);
            }
        });

        mSponsorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SponsorsActivity.class);
                startActivity(intent);
            }
        });

        }

    }


