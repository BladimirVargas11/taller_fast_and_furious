package com.taller.fast_and_furious.models.components;

public class Chasis {
    private int numEjes;
    private int numPieza;
    private String tipoTransmision;

    public Chasis(int numEjes, int numPieza, String tipoTransmision) {
        this.numEjes = numEjes;
        this.numPieza = numPieza;
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(int numPieza) {
        this.numPieza = numPieza;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
}