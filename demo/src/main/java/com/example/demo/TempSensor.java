package com.example.demo;

public class TempSensor extends Sensor{

    double value = 3000;

    String UUID = "IdkMan";

    public TempSensor(double value, String UUID){
        double tempNow = value;
        String thisUUID = UUID;

        System.out.println("Temp: " + tempNow + ", UUID: " + thisUUID );
    }
}
