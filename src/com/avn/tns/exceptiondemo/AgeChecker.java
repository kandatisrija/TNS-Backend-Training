package com.avn.tns.exceptiondemo;

public class AgeChecker {

    public void checkAge(int age) throws InvalidAge, ArithmeticException {
        if (age < 18) {
            throw new InvalidAge("The person is not eligible to vote");
        } else {
            System.out.println("The person is eligible to vote");
        }
    }
}