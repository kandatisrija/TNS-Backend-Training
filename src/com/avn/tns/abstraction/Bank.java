package com.avn.tns.abstraction;

// Demo for interface
public interface Bank {

    // abstract methods
    void deposit(int amount);
    void withdraw(int amount);

    // final / constant variables
    double DEPOSIT_LIMIT = 25000;
    double MIN_BAL = 1000;

    // default method
    default void greet() {
        System.out.println("Welcome to the Bank!");
    }

    // static method
    static void info() {
        System.out.println("Bank interface - Version 1.7 and above supports default & static methods.");
    }
}
