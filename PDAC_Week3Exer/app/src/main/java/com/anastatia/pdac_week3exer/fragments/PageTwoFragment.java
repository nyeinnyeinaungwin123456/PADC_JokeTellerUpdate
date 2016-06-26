package com.anastatia.pdac_week3exer.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.anastatia.pdac_week3exer.R;

/**
 * Created by Nyein Nyein on 6/23/2016.
 */
public class PageTwoFragment extends Fragment {

    TextView title2;
    TextView description2;
//    Context context;

    public PageTwoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_pagetwo, container, false);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Zawgyi.ttf");

        title2=(TextView)view.findViewById(R.id.tv_title2);
        description2=(TextView)view.findViewById(R.id.tv_description2);

//        description1.setMovementMethod(new ScrollingMovementMethod());

        title2.setTypeface(tf);
        description2.setTypeface(tf);

        description2.setMovementMethod(new ScrollingMovementMethod());

        Button next2 = (Button) view.findViewById(R.id.btn_next2);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageThreeFragment fragment=new PageThreeFragment();

                //in fragment don't use getSupportFragmentManager
                getFragmentManager().
                        beginTransaction().
                        replace(R.id.fl_container, fragment).
                        addToBackStack(null).
                        commit();


            }
        });

        Button previous2=(Button)view.findViewById(R.id.btn_previous2);
        previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageOneFragment fragment=new PageOneFragment();

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


