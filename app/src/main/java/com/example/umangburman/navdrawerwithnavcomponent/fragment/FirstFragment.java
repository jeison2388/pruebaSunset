package com.example.umangburman.navdrawerwithnavcomponent.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.umangburman.navdrawerwithnavcomponent.R;
import com.example.umangburman.navdrawerwithnavcomponent.adapter.AdaptadorLista;
import com.example.umangburman.navdrawerwithnavcomponent.model.ListaPrueba;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    /******************** VATIABLES LOCALES*******************/
    private RecyclerView listaPrueba;
    private List<ListaPrueba> datosPrueba;
    private AdaptadorLista adapter;

    /***********ELEMTOS iNTERFAZ*********/
    private View vista;
    private Context context;

    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.first_fragment, container, false);

        listaPrueba = (RecyclerView) vista.findViewById(R.id.list_prueba);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaPrueba.setLayoutManager(llm);
        cargarDatos();
        inicializarAdapter();

        return vista;
    }

    private void cargarDatos (){
        datosPrueba =  new ArrayList<>();
        datosPrueba.add(new ListaPrueba(R.drawable.header,"Juan Solano","Ingeniero Electrico","cra 5 an 12", "4.5"));
        datosPrueba.add(new ListaPrueba(R.drawable.header,"David Sotelo","Ingeniero Civil","cra 5 an 12", "5"));
        datosPrueba.add(new ListaPrueba(R.drawable.header,"Yaison Samboni","Ingeniero Sistemas","cra 5 an 12", "3.8"));
        datosPrueba.add(new ListaPrueba(R.drawable.header,"Patricia Queartaro","Ingeniero forestal","cra 5 an 12", "5"));
    }

    public void inicializarAdapter () {
        adapter = new AdaptadorLista(datosPrueba);
        listaPrueba.setAdapter(adapter);
    }
}
