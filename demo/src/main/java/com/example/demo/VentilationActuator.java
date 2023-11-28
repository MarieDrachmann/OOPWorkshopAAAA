package com.example.demo;

public class VentilationActuator extends Actuator{

    double value = 45;
    String UUID = "Firstyolo";

    public VentilationActuator(double value, String UUID){
        double openness = value;
        String myUUID = UUID;

        System.out.println("openness: " + openness + ", UUID: " + myUUID );
    }
}
