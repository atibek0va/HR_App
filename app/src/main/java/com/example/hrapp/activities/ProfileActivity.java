package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hrapp.R;

public class ProfileActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView btnBack;
    ImageView editUserInfo;
    LinearLayout layoutMonthly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initViews();
        onClicked();
    }
    public void initViews(){
        toolbar = findViewById(R.id.profile_tb);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        layoutMonthly = findViewById(R.id.layoutMonthly);
        btnBack = findViewById(R.id.back);
        editUserInfo = findViewById(R.id.editUserInfo);
    }
    public void onClicked(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, MainPageActivity.class));
            }
        });
        editUserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, EditUserInfo.class));
            }
        });
        layoutMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdActivity = new Intent(ProfileActivity.this, StatisticsActivity.class);
                startActivity(thirdActivity);
            }
        });
    }
}