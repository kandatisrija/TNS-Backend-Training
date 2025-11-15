package com.avn.tns.abstraction;

public class BankMain {
    public static void main(String[] args) {

        Bank ob = new BankImpl();  // interface reference, implementation object

        ob.greet();      // default method
        Bank.info();     // static method

        ob.deposit(5000);
        ob.withdraw(2000);
    }
}
