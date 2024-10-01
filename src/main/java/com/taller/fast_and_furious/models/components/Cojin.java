package com.taller.fast_and_furious.models.components;

public class Cojin {
    private int numPieza;
    private String material;

    public Cojin(int numPieza, String material) {
        this.numPieza = numPieza;
        this.material = material;
    }

    public int getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(int numPieza) {
        this.numPieza = numPieza;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
