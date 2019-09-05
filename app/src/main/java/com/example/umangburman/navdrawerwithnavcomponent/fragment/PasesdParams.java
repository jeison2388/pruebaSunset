package com.example.umangburman.navdrawerwithnavcomponent.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.umangburman.navdrawerwithnavcomponent.R;


public class PasesdParams extends Fragment {

    private TextView data;
    private View vista;

    public PasesdParams() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_pasesd_params, container, false);

        data = vista.findViewById(R.id.data);
        data.setText(getArguments().getString("amount"));
        return vista;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


}
