package com.avn.tns.exceptiondemo;

public class AgeMain {

    public static void main(String[] args) {

        AgeChecker a = new AgeChecker();

        try {
            a.checkAge(18);   // Change value to test
        } catch (ArithmeticException | InvalidAge e) {
            System.out.println(e);
        }
    }
}