package com.bob.marschen.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Administrator on 2015/6/20.
 */
public class CrimeListActivity extends SingleFragmentActivity  {
    @Override
    protected Fragment creatFragment() {
        return new CrimeListFragment();
    }
}
