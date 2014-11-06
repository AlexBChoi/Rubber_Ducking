package com.peardice.rubber_ducking;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        FragmentManager fm = getFragmentManager(); //using suppport library otherwise just getFragmentManager()
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        //Displays MainFragment content
        if(fragment == null) {
            fragment = new MainFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}