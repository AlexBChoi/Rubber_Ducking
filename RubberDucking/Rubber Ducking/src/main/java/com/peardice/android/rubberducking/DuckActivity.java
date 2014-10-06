package com.peardice.android.rubberducking;


import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.WindowManager;

public class DuckActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duck);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        FragmentManager fm = getSupportFragmentManager(); //using suppport library otherwise just getFragmetnManager()
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if(fragment == null) {
            fragment = new MainFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}
