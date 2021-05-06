package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.hrapp.R;
import com.example.hrapp.fragment.PsychFragment;

public class BronActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton showList, hideList;
    LinearLayout llayout;
    Toolbar toolbar;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bron);
        initViews();
    }

    public void initViews(){
        showList = findViewById(R.id.showList);
        hideList = findViewById(R.id.hideList);
        llayout = findViewById(R.id.llayout);

        toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(this);

        showList.setOnClickListener(this);
        hideList.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.showList){
            llayout.setVisibility(View.VISIBLE);
            showList.setVisibility(View.INVISIBLE);
        }else if (v.getId() == R.id.hideList){
            llayout.setVisibility(View.INVISIBLE);
            showList.setVisibility(View.VISIBLE);
        }else if (v.getId() == R.id.back){
            startActivity(new Intent(BronActivity.this, Doctors.class));
        }
    }
}