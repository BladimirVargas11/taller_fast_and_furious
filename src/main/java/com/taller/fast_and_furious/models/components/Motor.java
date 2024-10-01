package com.taller.fast_and_furious.models.components;

public class Motor {
    private int potenciaMaxima;
    private int numPieza;
    private String tecnologia;

    public Motor(int potenciaMaxima, int numPieza, String tecnologia) {
        this.potenciaMaxima = potenciaMaxima;
        this.numPieza = numPieza;
        this.tecnologia = tecnologia;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(int numPieza) {
        this.numPieza = numPieza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }
}
