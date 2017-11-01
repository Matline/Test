package com.example.mercy.phoodworld;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by mercy on 10/9/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int aNumOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.aNumOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                Comunity tab1 = new Comunity();
                return tab1;
            case 1:
                Recipe tab2 = new Recipe();
                return tab2;
            case 2:
                Events tab3 = new Events();
                return tab3;

    default:
        return null;

        }

    }

    @Override
    public int getCount() {

        return aNumOfTabs;
    }
}
