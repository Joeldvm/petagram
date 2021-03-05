package com.bbva.petagram;

public class ListaPets {

    private String nombreP;
    private int fotoP;

    public ListaPets(String nombreP, int fotoP){
        this.nombreP = nombreP;
        this.fotoP = fotoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getFotoP() {
        return fotoP;
    }

    public void setFotoP(int fotoP) {
        this.fotoP = fotoP;
    }
}
