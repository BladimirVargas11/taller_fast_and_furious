package com.taller.fast_and_furious.models.factory;

import com.taller.fast_and_furious.models.components.*;

public class MazdaFactory implements VehiculoFactory {

    @Override
    public Chasis crearChasis(int numEjes, int numPieza, String tipoTransmision) {
        return new Chasis(numEjes, numPieza, tipoTransmision);
    }

    @Override
    public Motor crearMotor(int potenciaMaxima, int numPieza, String tecnologia) {
        return new Motor(potenciaMaxima, numPieza, tecnologia);
    }

    @Override
    public Cojin crearCojin(int numPieza, String material) {

        return new Cojin(numPieza, material) ;
    }
}
