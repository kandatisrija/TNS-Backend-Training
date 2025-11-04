package mypack;
// Demo for different types of operators
public class Operators {
    public static void main(String[] args) {
    	
        // Arithmetic operators
        int x = 10, y = 2;
        boolean a = true, b = false;

        System.out.println("The addition value = " + (x + y)); //12
        System.out.println("The subtraction value = " + (x - y)); //8
        System.out.println("The division value = " + (x / y)); //5
        System.out.println("The multiplication value = " + (x * y)); //20

        // Relational operators ( <, >, <=, >=, ==, != )
        // We use relational operators in conditional statements and looping
        System.out.println("x == y : " + (x == y)); //false
        System.out.println("x != y : " + (x != y)); //true
        System.out.println("x > y : " + (x > y)); //true
        System.out.println("x < y : " + (x < y)); //false
        System.out.println("x >= y : " + (x >= y));  //true
        System.out.println("x <= y : " + (x <= y));  //false

        // Logical operators ( &&, ||, ! )
        System.out.println("a && b : " + (a && b)); //false
        System.out.println("a || b : " + (a || b)); //true
        System.out.println("!a : " + (!a));  //false

        // Unary operators (++ , --)
        int d = 10;
        // Post increment
        System.out.println("The post increment value is " + d++); // prints 10, then increments
        System.out.println("After post increment, d = " + d); // prints 11

        // Pre increment
        System.out.println("The pre increment value is " + (++d)); // increments then prints (12)
        System.out.println("Current value of d = " + d); // 12

        // Post decrement
        System.out.println("The post decrement value is " + d--); // prints 12, then decrements
        System.out.println("After post decrement, d = " + d); // 11

        // Pre decrement
        System.out.println("The pre decrement value is " + (--d)); // decrements then prints (10)
        System.out.println("Current value of d = " + d); // 10

        // Ternary operator (condition ? true : false)
        int a1 = 10, b1 = 5;
        int max = (a1 < b1) ? a1 : b1;
        System.out.println("The minimum value is: " + max);

        // Bitwise operators (&, |, ^, ~)
        int x1 = 10, y1 = 2;
        System.out.println("The result of AND operation: " + (x1 & y1));
        System.out.println("The result of OR operation: " + (x1 | y1));
        System.out.println("The result of XOR operation: " + (x1 ^ y1));
        System.out.println("The result of NOT operation (~x1): " + (~x1));
    }
}