package com.anastatia.pdac_week3exer.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.anastatia.pdac_week3exer.R;

/**
 * Created by Nyein Nyein on 6/24/2016.
 */
public class PageThreeFragment extends Fragment {

    TextView title3;
    TextView description3;
//    Context context;

    public PageThreeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_pagethree, container, false);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Zawgyi.ttf");
//
        title3=(TextView)view.findViewById(R.id.tv_title3);
        description3=(TextView)view.findViewById(R.id.tv_description3);

//        description3.setMovementMethod(new ScrollingMovementMethod());

        title3.setTypeface(tf);
        description3.setTypeface(tf);

        description3.setMovementMethod(new ScrollingMovementMethod());

        Button next3 = (Button) view.findViewById(R.id.btn_next3);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"No story available", Toast.LENGTH_LONG).show();
            }
        });

        Button previous3=(Button)view.findViewById(R.id.btn_previous3);
        previous3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageTwoFragment fragment=new PageTwoFragment();

                //in fragment don't use getSupportFragmentManager
                getFragmentManager().
                        beginTransaction().
                        replace(R.id.fl_container, fragment).
                        addToBackStack(null).
                        commit();

            }
        });

        return view;
    }
}
