package com.example.umangburman.navdrawerwithnavcomponent.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.umangburman.navdrawerwithnavcomponent.fragment.FragmentTabV2;
import com.example.umangburman.navdrawerwithnavcomponent.fragment.FragmentTabV3;

public class FragmentAdapterV3  extends FragmentPagerAdapter {

    public FragmentAdapterV3(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new FragmentTabV3();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Doc Info";
            case 1: return "Cli Info";
            case 2: return "Review";
            default:return null;
        }
    }
}
