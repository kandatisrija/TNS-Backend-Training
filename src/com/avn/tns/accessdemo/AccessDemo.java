package com.avn.tns.accessdemo;

public class AccessDemo {

    // Access modifiers
    public String empName;        // public
    private int empId;            // private
    protected String department;  // protected
    String company;               // default (no modifier)

    // Getter and Setter for private variable
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Method to display details
    public void display() {
        System.out.println("===== Employee Details =====");
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Company: " + company);
        System.out.println("============================");
    }
}
