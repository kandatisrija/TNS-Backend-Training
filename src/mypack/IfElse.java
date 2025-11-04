package mypack;

// Program to find grade based on marks using if-else statement
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter marks
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt(); // store user input in variable 'marks'

        // Check marks and print grade accordingly
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        // Close the Scanner object
        sc.close();
    }
}
