package com.taller.fast_and_furious.models.factory;


import com.taller.fast_and_furious.models.components.*;

public interface VehiculoFactory {

    Chasis crearChasis(int numEjes, int numPieza, String tipoTransmision);

    Motor crearMotor(int potenciaMaxima, int numPieza, String tecnologia);
    Cojin crearCojin(int numPieza, String material);
}
