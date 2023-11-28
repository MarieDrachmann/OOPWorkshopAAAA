package com.example.demo;

public class Actuator extends Unit{

    private double value;
    VentilationActuator dender = new VentilationActuator(99.5, "nejtak");

    public void SetValue(double value){
        double newValue = value;

        dender.value = newValue;
    }

    public double GetValue(){
        return dender.value;
    }

}
