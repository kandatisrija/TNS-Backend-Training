package com.avn.tns.abstraction;

public class AbstractMain {

    public static void main(String[] args) {

        AbstractDemo ob = new AbstractImpl(); // Upcasting

        ob.add();
        ob.display();
    }
}
