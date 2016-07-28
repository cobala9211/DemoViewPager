package com.example.dnp.demoviewpager.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.dnp.demoviewpager.R;
import com.example.dnp.demoviewpager.adapter.AdapterZoom;
import com.example.dnp.demoviewpager.transformer.ZoomOutPageTransformer;

/**
 * Created by dnp on 15/07/2016.
 */
public class ZoomAcvitivity extends AppCompatActivity{
    private AdapterZoom mAdapterZoom;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_out);
        ViewPager viewPager = (ViewPager) findViewById(R.id.vpZoom);
        mAdapterZoom = new AdapterZoom(getSupportFragmentManager());
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        viewPager.setAdapter(mAdapterZoom);
    }
}
