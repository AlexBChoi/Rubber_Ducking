package com.peardice.android.rubberducking;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageButton;

public class MainFragment extends Fragment {
    private Duck mDuck;
    private ImageButton mFaceLeftButton;
    private ImageButton mFaceRightButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDuck = new Duck();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, parent, false); //used to be fragment_left got a nullpointer excpetion error on the v.FindViewById

        mFaceLeftButton = (ImageButton)v.findViewById(R.id.face_left_button);
        mFaceLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeftFragment leftFragment = new LeftFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction(); //FragmentManager fragmentManager = getFragmentManager(); can call this instead for getF
                ft.replace(R.id.fragmentContainer, leftFragment); // Replace whatever is in the fragment_container view with this fragment,
                ft.addToBackStack(null);  //without this app exits when you press back at big duck
                ft.commit();
            }
        });

        mFaceRightButton = (ImageButton)v.findViewById(R.id.face_right_button); //v.findViewById(R.id.face_right_button);
        mFaceRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RightFragment rightFragment = new RightFragment();
                FragmentTransaction ft = getFragmentManager().beginTransaction(); //FragmentManager fragmentManager = getFragmentManager(); can call this instead for getF
                ft.replace(R.id.fragmentContainer, rightFragment);
                ft.addToBackStack(null);  //without this app exits when you press back at big duck
                ft.commit();
            }
        });

        return v;
    }
}