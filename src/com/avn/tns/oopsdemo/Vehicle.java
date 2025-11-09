package com.avn.tns.oopsdemo;

// Demo for inheritance --> code reusability
// parent,child-- superclass and subclass -- base class and derived class
// Types of inheritance --> single, multilevel, hierarchy (multiple not supported)
public class Vehicle {
    public String brand;
    public String model;
    
    public Vehicle(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
    }
    
    void startEngine() {
        System.out.println("When engine is started the vehicle moves");
    }
}
