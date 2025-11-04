package mypack;

public class WhileLoop{
    public static void main(String[] args) {

        int i = 1;     // starting number
        int sum = 0;   // variable to store total

        // while loop to add numbers from 1 to 5
        while (i <= 5) {
            sum = sum + i;  // add current number to sum
            i++;            // move to next number
        }

        System.out.println("The sum of first 5 natural numbers is: " + sum);
    }
}
