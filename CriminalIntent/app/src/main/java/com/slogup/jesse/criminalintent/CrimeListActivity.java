package com.slogup.jesse.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by Jesse on 2016-11-08.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
