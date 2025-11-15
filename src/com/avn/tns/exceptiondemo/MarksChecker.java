package com.avn.tns.exceptiondemo;

public class MarksChecker {

    public void checkMarks(int marks) throws InvalidMarks, ArithmeticException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarks("Please enter marks between 0 and 100");
        } else {
            System.out.println("The student is promoted");
        }
    }
}
