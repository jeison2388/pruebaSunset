package com.example.umangburman.navdrawerwithnavcomponent.model;

public class ListaPrueba {

    private int foto;
    private String tituloItem;
    private String nombreItem;
    private String ubicacionItem;
    private String puntajeItem;


    public ListaPrueba(int foto, String tituloItem, String nombreItem, String ubicacionItem, String puntajeItem) {
        this.foto = foto;
        this.tituloItem = tituloItem;
        this.nombreItem = nombreItem;
        this.ubicacionItem = ubicacionItem;
        this.puntajeItem = puntajeItem;
    }

    public String getPuntajeItem() {
        return puntajeItem;
    }

    public void setPuntajeItem(String puntajeItem) {
        this.puntajeItem = puntajeItem;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTituloItem() {
        return tituloItem;
    }

    public void setTituloItem(String tituloItem) {
        this.tituloItem = tituloItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getUbicacionItem() {
        return ubicacionItem;
    }

    public void setUbicacionItem(String ubicacionItem) {
        this.ubicacionItem = ubicacionItem;
    }
}
