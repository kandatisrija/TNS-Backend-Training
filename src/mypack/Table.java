package mypack;

// Program to print the multiplication table of a number using for loop
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");

        // for loop runs 10 times — from i = 1 to i = 10
        for (int i = 1; i <= 10; i++) {
            // Print each multiplication result
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Close the scanner object to avoid memory leaks
        sc.close();
    }
}
