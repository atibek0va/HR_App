package com.example.hrapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hrapp.R;

public class HomeFragment extends Fragment {

    View view;
    Button positive, ortasha, superMood, jaman, depression, stress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);

        positive = view.findViewById(R.id.positive);
        ortasha = view.findViewById(R.id.ortasha);
        superMood = view.findViewById(R.id.superMood);
        jaman = view.findViewById(R.id.jaman);
        depression = view.findViewById(R.id.depression);
        stress = view.findViewById(R.id.stress);

        positive.getBackground().setAlpha(64);
        ortasha.getBackground().setAlpha(64);
        superMood.getBackground().setAlpha(64);
        jaman.getBackground().setAlpha(64);
        depression.getBackground().setAlpha(64);
        stress.getBackground().setAlpha(64);
        return view;
    }
}