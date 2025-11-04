package mypack;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;  // starting value
        
        // do-while loop runs at least once
        do {
            System.out.println("Number: " + i);
            i++;  // increment the value
        } while (i <= 5);  // condition check after execution
        
        System.out.println("Loop finished!");
    }
}
