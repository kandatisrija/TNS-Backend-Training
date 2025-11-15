package com.avn.tns.abstraction;

public class BankImpl implements Bank {

    double balance = 1000;

    @Override
    public void deposit(int amount) {
        if (amount <= DEPOSIT_LIMIT) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.err.println("Exceeds the deposit limit!");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= MIN_BAL + amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.err.println("Insufficient balance!");
        }
    }
}
