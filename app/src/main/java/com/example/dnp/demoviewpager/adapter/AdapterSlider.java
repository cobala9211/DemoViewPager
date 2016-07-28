package com.example.dnp.demoviewpager.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dnp.demoviewpager.fragment.FirstFragment;
import com.example.dnp.demoviewpager.fragment.SecondFragment;
import com.example.dnp.demoviewpager.fragment.ThirdFragment;

/**
 * Created by dnp on 15/07/2016.
 */
public class AdapterSlider extends FragmentPagerAdapter {
    public static final int NUMBER_PAGER = 3;

    public AdapterSlider(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.newIntence(position);
            case 1:
                return SecondFragment.newIntence(position);
            case 2:
                return ThirdFragment.newIntence(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        return NUMBER_PAGER;
    }
}
