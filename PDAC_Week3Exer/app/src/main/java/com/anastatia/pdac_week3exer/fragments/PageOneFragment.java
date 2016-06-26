package com.anastatia.pdac_week3exer.fragments;

import android.graphics.Typeface;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.anastatia.pdac_week3exer.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PageOneFragment extends Fragment {

    TextView title1;
    TextView description1;

    //    Context context;

    public PageOneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_pageone, container, false);

        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Zawgyi.ttf");

        title1=(TextView)view.findViewById(R.id.tv_title1);
        description1=(TextView)view.findViewById(R.id.tv_description1);

        description1.setMovementMethod(new ScrollingMovementMethod());

        title1.setTypeface(tf);
        description1.setTypeface(tf);

        description1.setMovementMethod(new ScrollingMovementMethod());


//        final RadioButton funny=(RadioButton) view.findViewById(R.id.rg_funny1);

        Button next1 = (Button) view.findViewById(R.id.btn_next1);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PageTwoFragment fragment=new PageTwoFragment();

                getFragmentManager().
                        beginTransaction().
                        replace(R.id.fl_container, fragment).
                        addToBackStack(null).
                        commit();


            }
        });

        Button previous1=(Button)view.findViewById(R.id.btn_previous1);
        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"No story available", Toast.LENGTH_LONG).show();

            }
        });


        return view;
    }


}
