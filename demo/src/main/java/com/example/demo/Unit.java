package com.example.demo;

public abstract class Unit{
    private String name;
    private String UUID;

    public String GetUUID(){

        return this.UUID;
    }

    public String GetName(){

        return this.name;
    }
    public String ToString(){

        return this.UUID + this.name;
    }
}
