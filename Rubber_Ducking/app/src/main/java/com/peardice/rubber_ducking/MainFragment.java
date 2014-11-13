package com.peardice.rubber_ducking;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MainFragment extends Fragment {
    private ImageButton mFaceLeftButton;
    private ImageButton mFaceRightButton;

    public MainFragment() {
        //Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, parent, false);

        mFaceLeftButton = (ImageButton)v.findViewById(R.id.face_left_button);
        mFaceLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeftFragment leftFragment = new LeftFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainer, leftFragment); //replaces current view in fragmentContainer with leftFragment
                ft.addToBackStack(null);  //prevents app from exiting when pressing back at big duck
                ft.commit();
            }
        });

        mFaceRightButton = (ImageButton)v.findViewById(R.id.face_right_button);
        mFaceRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RightFragment rightFragment = new RightFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.fragmentContainer, rightFragment); //replaces current view in fragmentContainer with rightFragment
                ft.addToBackStack(null);  //prevents app from exiting when pressing back at big duck
                ft.commit();
            }
        });

        return v;
    }
}