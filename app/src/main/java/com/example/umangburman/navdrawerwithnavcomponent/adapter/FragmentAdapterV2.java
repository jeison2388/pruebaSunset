package com.example.umangburman.navdrawerwithnavcomponent.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.umangburman.navdrawerwithnavcomponent.fragment.FragmentTabV2;

public class FragmentAdapterV2 extends FragmentPagerAdapter {
    public FragmentAdapterV2(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new FragmentTabV2();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "initiate";
            case 1: return "verify";
            case 2: return "confirm";
            default:return null;
        }
    }
}
