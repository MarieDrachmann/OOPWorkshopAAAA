package com.example.demo;

public class Sensor extends Unit{

    CO2Sensor value = new CO2Sensor(35, "av");
    TempSensor tempSensor = new TempSensor(98, "noair");
    public double GetValue(){
        return value.GetValue() + tempSensor.GetValue();
    }



}
