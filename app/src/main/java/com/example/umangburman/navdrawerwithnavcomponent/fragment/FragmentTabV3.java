package com.example.umangburman.navdrawerwithnavcomponent.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.umangburman.navdrawerwithnavcomponent.R;


public class FragmentTabV3 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_tab_v3, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


}
