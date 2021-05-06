package com.example.hrapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.hrapp.fragment.ComplaintFragment;
import com.example.hrapp.fragment.QuestionFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    int counttab;

    public TabAdapter(@NonNull FragmentManager fm, int counttab) {
        super(fm, counttab);
        this.counttab = counttab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                QuestionFragment questionFragment = new QuestionFragment();
                return questionFragment;
            case 1:
                ComplaintFragment complaintFragment = new ComplaintFragment();
                return complaintFragment;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return counttab;
    }
}
