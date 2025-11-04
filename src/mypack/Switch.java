package mypack;

// Program to display day name based on day number using switch case
import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter day number
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt(); // store user input in variable 'day'

        // Check and print day name using switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
        }

        // Close the Scanner object
        sc.close();
    }
}
