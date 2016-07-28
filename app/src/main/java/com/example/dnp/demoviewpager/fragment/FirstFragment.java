package com.example.dnp.demoviewpager.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dnp.demoviewpager.R;

/**
 * Created by dnp on 15/07/2016.
 */
public class FirstFragment extends Fragment {
    public static final String NUM_PAGER = "NUMBER";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_firts, container, false);
        return view;
    }
    public static FirstFragment newIntence (int page){
        Bundle mBundle = new Bundle();
        mBundle.putInt("NUM_PAGER", page);
        FirstFragment firstFragment = new FirstFragment();
        firstFragment.setArguments(mBundle);
        return firstFragment;
    }
}
