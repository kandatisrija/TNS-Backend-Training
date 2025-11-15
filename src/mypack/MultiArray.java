package mypack;

public class MultiArray{
    public static void main(String[] args) {

        // 2D Array (Matrix)
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix elements:");

        // Nested for loop to print 2D array
        for (int i = 0; i < arr.length; i++) {          // Rows
            for (int j = 0; j < arr[i].length; j++) {   // Columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to next row
        }
    }
}
