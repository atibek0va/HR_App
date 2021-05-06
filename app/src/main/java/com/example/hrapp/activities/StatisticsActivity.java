package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hrapp.R;

public class StatisticsActivity extends AppCompatActivity {

    ImageView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        initViews();
    }
    public void initViews(){
        btnExit = findViewById(R.id.btnExit);
    }

    public void onClicked(){
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatisticsActivity.this, ProfileActivity.class));
            }
        });
    }
}