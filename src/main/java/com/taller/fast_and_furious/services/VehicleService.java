package com.taller.fast_and_furious.services;

import com.taller.fast_and_furious.models.Vehicle;
import com.taller.fast_and_furious.models.factory.VehiculoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

    @Autowired
    private VehiculoFactory toyotaFactory;
    @Autowired
    private VehiculoFactory fordFactory;
    @Autowired
    private VehiculoFactory mazdaFactory;

    public Vehicle assembleVehicle(String brand, String color, int assemblyNumber) {
        VehiculoFactory factory;
        switch (brand.toLowerCase()) {
            case "toyota":
                factory = toyotaFactory;
                break;
            case "ford":
                factory = fordFactory;
                break;
            case "mazda":
                factory = mazdaFactory;
                break;
            default:
                throw new IllegalArgumentException("Marca no soportada");
        }

        return new Vehicle(
                brand,
                factory.crearChasis(1,2,"Electrica"),
                factory.crearMotor(100,100, "Caballos"),
                factory.crearCojin(4, "Cuero"),
                color,
                assemblyNumber
        );
    }
}