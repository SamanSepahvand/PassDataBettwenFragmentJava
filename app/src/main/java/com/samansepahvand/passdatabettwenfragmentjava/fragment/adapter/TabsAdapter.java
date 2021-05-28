package com.samansepahvand.passdatabettwenfragmentjava.fragment.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.samansepahvand.passdatabettwenfragmentjava.fragment.AboutFragment;
import com.samansepahvand.passdatabettwenfragmentjava.fragment.ContactFragment;
import com.samansepahvand.passdatabettwenfragmentjava.fragment.HomeFragment;

/**
 * Created by tutlane on 19-12-2017.
 */

public class TabsAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                HomeFragment home = new HomeFragment();
                return home;
            case 1:
                AboutFragment about = new AboutFragment();
                return about;
            case 2:
                ContactFragment contact = new ContactFragment();
                return contact;
            default:
                return null;
        }
    }
}
