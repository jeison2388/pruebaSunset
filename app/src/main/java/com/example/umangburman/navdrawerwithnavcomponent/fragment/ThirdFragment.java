package com.example.umangburman.navdrawerwithnavcomponent.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.umangburman.navdrawerwithnavcomponent.R;
import com.example.umangburman.navdrawerwithnavcomponent.adapter.FragmentAdapterV2;
import com.example.umangburman.navdrawerwithnavcomponent.adapter.FragmentAdapterV3;
import com.google.android.material.tabs.TabLayout;

public class ThirdFragment extends Fragment {

    private TabLayout tab;
    private ViewPager viewPager;
    private FragmentAdapterV3 fragmentAdapter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.third_fragment, container, false);
        tab = vista.findViewById(R.id.tab_vista3);
        viewPager = vista.findViewById(R.id.pager_vista3);
        fragmentAdapter = new FragmentAdapterV3(getFragmentManager());

        viewPager.setAdapter(fragmentAdapter);
        tab.setupWithViewPager(viewPager);
        return vista;
    }
}

