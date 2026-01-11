package simplebank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleBankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Customer> customers = new HashMap<>();
        Map<Integer, Account> accounts = new HashMap<>();

        int choice;

        do {
            System.out.println("\n--- Simple Banking System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Deposit");
            System.out.println("4. View Customer");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    customers.put(cid, new Customer(cid, name));
                    System.out.println("Customer Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account ID: ");
                    int aid = sc.nextInt();

                    System.out.print("Enter Customer ID: ");
                    int custId = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    accounts.put(aid, new Account(aid, custId, bal));
                    System.out.println("Account Added Successfully!");
                    break;

                case 3:
                    System.out.print("Enter Account ID: ");
                    int accId = sc.nextInt();

                    System.out.print("Enter Amount to Deposit: ");
                    double amt = sc.nextDouble();

                    Account acc = accounts.get(accId);
                    if (acc != null) {
                        acc.balance = acc.balance + amt;
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance: " + acc.balance);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int findId = sc.nextInt();

                    Customer c = customers.get(findId);
                    if (c != null) {
                        System.out.println("Customer ID: " + c.id);
                        System.out.println("Name: " + c.name);
                    } else {
                        System.out.println("Customer not found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
