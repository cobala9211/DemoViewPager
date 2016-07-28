package com.example.dnp.demoviewpager.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dnp.demoviewpager.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnSlide, btnZoomOut, btnPedth, btnCardAnimation, btnZooming, btnLayoutChanges;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btnSlide = (Button) findViewById(R.id.btnSlider);
        btnSlide.setOnClickListener(this);
        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnZoomOut.setOnClickListener(this);
        btnPedth = (Button) findViewById(R.id.btnDepth);
        btnPedth.setOnClickListener(this);
        btnCardAnimation = (Button) findViewById(R.id.btnCardAnimation);
        btnCardAnimation.setOnClickListener(this);
        btnZooming = (Button) findViewById(R.id.btnZooming);
        btnZooming.setOnClickListener(this);
        btnLayoutChanges = (Button) findViewById(R.id.btnLayoutChanges);
        btnLayoutChanges.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.btnSlider:
                sendIntent(SliderActivity.class);
                break;
            case R.id.btnZoomOut:
                sendIntent(ZoomAcvitivity.class);
                break;
            case R.id.btnDepth:
                sendIntent(DepthActivity.class);
                break;
            case R.id.btnCardAnimation:
                sendIntent(CardActivity.class);
                break;
            case R.id.btnZooming:
                sendIntent(ZoomingViewActivity.class);
                break;
            case R.id.btnLayoutChanges:
                sendIntent(LayoutChangesActivity.class);
                break;
            default:
                break;
        }
    }

    public void sendIntent(Class mClass){
        Intent intent = new Intent(MainActivity.this, mClass);
        startActivity(intent);
    }
}
