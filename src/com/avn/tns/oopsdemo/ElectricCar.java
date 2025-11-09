package com.avn.tns.oopsdemo;

public class ElectricCar extends Vehicle {
    public int batteryCapcity;

    public ElectricCar(String brand, String model, int batteryCapcity) {
        super(brand, model);
        this.batteryCapcity = batteryCapcity;
    }

    public void charge() {
        System.out.println("The capacity of battery goes till 5hrs");
    }
}
