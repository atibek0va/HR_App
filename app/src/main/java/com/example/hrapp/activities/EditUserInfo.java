package com.example.hrapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.hrapp.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditUserInfo extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    ImageView btnBack;
    Button btnSave;
    DatabaseReference myRef;
    FirebaseDatabase database;
    String userCurrentEmail;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_user_info);
        initViews();
    }

    public void initViews(){
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        auth = FirebaseAuth.getInstance();

        toolbar = findViewById(R.id.profile_tb);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btnBack = findViewById(R.id.back);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(this);
        btnBack.setOnClickListener(this);

//        userCurrentEmail = auth.getCurrentUser().getEmail().replace(".", "-");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSave){
//            saveInfo();
            startActivity(new Intent(EditUserInfo.this, UserInfo.class));
        }else if (v.getId() == R.id.back){
            startActivity(new Intent(EditUserInfo.this, ProfileActivity.class));
        }
    }

//    public void saveInfo(){
//        String unumber = number.getText().toString();
//        String uhour = hour.getText().toString();
//
//        myRef.child("users").child(userCurrentEmail).child("hour").setValue(uhour);
//        myRef.child("users").child(userCurrentEmail).child("number").setValue(unumber);
////        myRef.child.("users").child(userCurrentEmail).child("number".setValue(unmumber));
//    }
}