package com.avn.tns.accessdemo;

public class AccessMain {

    public static void main(String[] args) {

        // Creating object
        AccessDemo emp = new AccessDemo();

        // Accessing public and default members directly
        emp.empName = "Srija";
        emp.department = "AI & ML";
        emp.company = "TechSoft Pvt Ltd";

        // Accessing private variable through setter
        emp.setEmpId(1025);

        // Display the values
        emp.display();

        // Print individually
        System.out.println("Employee ID (via getter): " + emp.getEmpId());
    }
}
