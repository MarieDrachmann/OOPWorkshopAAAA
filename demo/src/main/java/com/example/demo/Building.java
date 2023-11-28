package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Building extends  Unit{
    private List<Sensor> sensor = new ArrayList<Sensor>();
    private List<Actuator> actuator = new ArrayList<Actuator>();

    public List<Sensor> GetSensors(){

            return sensor;

    }

    public List<Actuator> GetActuators(){
        return actuator;
    }

    public String AddTempSensor(){
        sensor.add()
    }

    public String AddCO2Sensor(){

    }

    public String AddActuator(){

    }

    public void RemoveSensor(){

    }
    public void RemoveActuator(){

    }
}
