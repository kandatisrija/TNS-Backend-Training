package mypack;

import java.util.Scanner; // Import Scanner class

public class InputScanner {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Id: ");
        int Id = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Display the input values
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + Id);
        System.out.println("Marks: " + marks);

        // Close Scanner
        sc.close();
    }
}
