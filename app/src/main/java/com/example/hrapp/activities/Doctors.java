package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.hrapp.R;
import com.example.hrapp.adapter.DoctorAdapter;
import com.example.hrapp.fragment.PsychFragment;
import com.example.hrapp.model.Doctor;

import java.util.ArrayList;

public class Doctors extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    ImageView btnBack;
    RecyclerView recyclerView;
    DoctorAdapter doctorAdapter;
    ArrayList<Doctor> doctorList;
    private RecyclerView.LayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        initViews();
        getDoctor();
    }

    public void initViews(){
        toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btnBack = findViewById(R.id.back);

        btnBack.setOnClickListener(this);

        recyclerView = findViewById(R.id.recycler);
        doctorList = new ArrayList<>();
        doctorAdapter = new DoctorAdapter(this, doctorList);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(doctorAdapter);
    }
    public void getDoctor(){
        doctorList.add(new Doctor("123", "url", "Dr.Nurbek", "Work experience: 3 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("124", "url","Dr.Turlibaev", "Work experience: 4 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("125", "url", "Dr.Nurbek", "Work experience: 3 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("126", "url", "Dr.Madibee", "Work experience: 5 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("127", "url", "Dr.Madibee", "Work experience: 5 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("128", "url", "Dr.Madibee", "Work experience: 5 years", "+7 708 419 54 22"));
        doctorList.add(new Doctor("129", "url", "Dr.Madibee", "Work experience: 5 years", "+7 708 419 54 22"));
        doctorAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.back){
            startActivity(new Intent(Doctors.this, PsychFragment.class));
        }
    }
}