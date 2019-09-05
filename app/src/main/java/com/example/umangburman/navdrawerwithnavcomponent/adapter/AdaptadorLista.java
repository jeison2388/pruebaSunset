package com.example.umangburman.navdrawerwithnavcomponent.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import com.example.umangburman.navdrawerwithnavcomponent.R;
import com.example.umangburman.navdrawerwithnavcomponent.model.ListaPrueba;

import java.util.List;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.ListaViewHolder> {

    private List<ListaPrueba> listaPrueba;


    public AdaptadorLista(List<ListaPrueba> listaPrueba ) {
        this.listaPrueba = listaPrueba;

    }

    @NonNull
    @Override
    public AdaptadorLista.ListaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ListaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.ListaViewHolder holder, int position) {
        ListaPrueba listaModel = listaPrueba.get(position);
        holder.imgFoto.setImageResource(listaModel.getFoto());
        holder.textTitulo.setText(listaModel.getTituloItem());
        holder.textNombre.setText(listaModel.getNombreItem());
        holder.textUbicacion.setText(listaModel.getUbicacionItem());
        holder.textPuntaje.setText(listaModel.getPuntajeItem());
    }

    @Override
    public int getItemCount() {
        return listaPrueba.size();
    }


    public static class  ListaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView textTitulo;
        private TextView textNombre;
        private TextView textUbicacion;
        private TextView textPuntaje;

        public ListaViewHolder(@NonNull View itemView) {
            super(itemView);

            imgFoto = (ImageView) itemView.findViewById(R.id.imageList);
           textTitulo = (TextView) itemView.findViewById(R.id.lbl_tituloItem);
           textNombre = (TextView) itemView.findViewById(R.id.lbl_nombreItem);
           textUbicacion = (TextView) itemView.findViewById(R.id.lbl_ubicacion);
           textPuntaje = (TextView) itemView.findViewById(R.id.lbl_puntaje);
        }
    }
}
