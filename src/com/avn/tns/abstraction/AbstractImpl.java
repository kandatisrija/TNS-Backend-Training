package com.avn.tns.abstraction;

public class AbstractImpl extends AbstractDemo {

    @Override
    void add() {
        System.out.println("Abstract method implemented in subclass");
    }

    @Override
    void display() {
        System.out.println("Display method overridden");
    }
}
