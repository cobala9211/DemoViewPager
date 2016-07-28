package com.example.dnp.demoviewpager.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.dnp.demoviewpager.R;
import com.example.dnp.demoviewpager.adapter.AdapterDepth;
import com.example.dnp.demoviewpager.transformer.DepthPageTransformer;

/**
 * Created by dnp on 15/07/2016.
 */
public class DepthActivity extends AppCompatActivity {
    private AdapterDepth mAdapterDepth;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depth);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vpDepth);
        mAdapterDepth = new AdapterDepth(getSupportFragmentManager());
        viewPager.setPageTransformer(true, new DepthPageTransformer());
        viewPager.setAdapter(mAdapterDepth);
    }
}
