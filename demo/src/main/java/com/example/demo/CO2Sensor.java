package com.example.demo;

public class CO2Sensor extends Sensor{

    double value = 90;

    String UUID = "CantBreath";

    public CO2Sensor(double value, String UUID){
        double carbonDiOxidLevel = value;
        String thisUUID = UUID;

        System.out.println("Temp: " + carbonDiOxidLevel + ", UUID: " + thisUUID );
    }
}
