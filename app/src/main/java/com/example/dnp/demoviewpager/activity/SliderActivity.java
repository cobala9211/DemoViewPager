package com.example.dnp.demoviewpager.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.dnp.demoviewpager.R;
import com.example.dnp.demoviewpager.adapter.AdapterSlider;

/**
 * Created by dnp on 15/07/2016.
 */
public class SliderActivity extends AppCompatActivity {
    AdapterSlider mAdapterSlider;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vpSlider);
        mAdapterSlider = new AdapterSlider(getSupportFragmentManager());
        viewPager.setAdapter(mAdapterSlider);
    }
}
