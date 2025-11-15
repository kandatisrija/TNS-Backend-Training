package com.avn.tns.exceptiondemo;

public class MarksMain {

    public static void main(String[] args) {

        MarksChecker m = new MarksChecker();

        try {
            m.checkMarks(90);   // change value to test
        } catch (InvalidMarks | ArithmeticException e) {
            System.out.println(e);
        }
    }
}