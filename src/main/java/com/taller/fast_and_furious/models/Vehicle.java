package com.taller.fast_and_furious.models;

import com.taller.fast_and_furious.models.components.*;

public class Vehicle {

    private String brand;
    private Chasis chasis;
    private Motor motor;
    private Cojin cojin;
    private String color;
    private int assemblyNumber;


    public Vehicle(String brand, Chasis chasis, Motor motor, Cojin cojin, String color, int assemblyNumber) {
        this.brand = brand;
        this.chasis = chasis;
        this.motor = motor;
        this.cojin = cojin;
        this.color = color;
        this.assemblyNumber = assemblyNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Cojin getCojin() {
        return cojin;
    }

    public void setCojin(Cojin cojin) {
        this.cojin = cojin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAssemblyNumber() {
        return assemblyNumber;
    }

    public void setAssemblyNumber(int assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
    }
}
