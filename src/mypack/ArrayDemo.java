package mypack;

public class ArrayDemo {
    public static void main(String[] args) {

        // Declare and initialize a single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};

        // Display elements using enhanced for loop
        System.out.println("Array elements are:");
        for (int num : numbers) {   // enhanced for loop
            System.out.println(num);
        }
    }
}
