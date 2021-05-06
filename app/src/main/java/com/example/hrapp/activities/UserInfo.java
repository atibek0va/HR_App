package com.example.hrapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hrapp.R;
import com.example.hrapp.model.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserInfo extends AppCompatActivity implements View.OnClickListener {

    TextView name, email, number, hour;
    Button editUserInfo;
    FirebaseAuth auth;
    DatabaseReference databaseReference;
    String userCurrent;
    User userm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        initViews();
        user_info();
    }

    public void initViews(){
        auth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();


        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        hour = findViewById(R.id.hour);

        editUserInfo = findViewById(R.id.editUserInfo);
        editUserInfo.setOnClickListener(this);
    }

    public void user_info(){
        userCurrent = auth.getCurrentUser().getEmail().replace(".", "-");
        Log.i("currentUser", userCurrent);

        getInfo(userCurrent);
    }

    private void getInfo(String userCurrent) {
        databaseReference.child("users").child(userCurrent).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                userm = snapshot.getValue(User.class);
                name.setText(userm.getName());
                email.setText(userm.getEmail());
                number.setText(userm.getNumber());
                hour.setText(userm.getHour());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.editUserInfo){
            startActivity(new Intent(UserInfo.this, EditUserInfo.class));
        }
    }
}