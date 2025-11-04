package mypack;

// Simple class to store employee details
public class Employee {
    int empId;
    String empName;
    String department;

    // Method to print employee details
    void printDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department);
    }
}