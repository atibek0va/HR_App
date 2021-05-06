package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hrapp.R;

public class Welcome extends AppCompatActivity {

    Button employee, newempl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initViews();
        onClicked();
    }

    public void initViews(){
        employee = findViewById(R.id.employee);
        newempl = findViewById(R.id.newempl);
    }

    public void onClicked(){
        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome.this, MainPageActivity.class));
            }
        });

        newempl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Welcome.this, MainPageActivity.class));
            }
        });
    }
}