package com.example.umangburman.navdrawerwithnavcomponent.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.umangburman.navdrawerwithnavcomponent.R;

public class PracticeFragment extends Fragment {


    private Button boton;
    private View vista;
    public PracticeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_practice, container, false);

        boton = vista.findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("amount", "que cosas que tien la vida");
                Navigation.findNavController(view).navigate(R.id.pasedParams, bundle);
            }
        });

        return vista;

    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

}
