package com.example.hrapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hrapp.R;
import com.example.hrapp.adapter.TabAdapter;
import com.google.android.material.tabs.TabLayout;

public class QuestionFragment extends Fragment {

    View view;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =inflater.inflate(R.layout.fragment_question, container, false);

//        tabLayout = view.findViewById(R.id.tabLayout);
//        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
//        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        viewPager = view.findViewById(R.id.viewPager);
//        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
//        viewPager.setAdapter (tabAdapter);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem ( tab.getPosition ());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

       return view;
    }
}