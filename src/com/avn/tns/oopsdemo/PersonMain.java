package com.avn.tns.oopsdemo;

public class PersonMain {
    public static void main(String[] args) {
        // Create an object of Person
        Person p1 = new Person();

        // Set values using setter methods
        p1.setPid(108);
        p1.setName("SrijaReddy");
        p1.setAge(20);

        // Display values using getter methods
        System.out.println("Person Details:");
        System.out.println("ID: " + p1.getPid());
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
