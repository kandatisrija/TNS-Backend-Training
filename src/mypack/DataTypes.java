package mypack;

public class DataTypes{

    // Instance variables (non-static, need an object to access)
    byte byteVar = -50;
    short shortVar = 15000;
    int intVar = 987654321;
    long longVar = 12345678900L;
    float floatVar = 9.81f;
    double doubleVar = 2.71828182846;
    boolean booleanVar = false;
    char charVar = 'Z';

    // Method to display all data type values
    void displayValues() {
        System.out.println("=== Java Primitive Data Types Demo ===");
        System.out.println("byte value: " + byteVar);
        System.out.println("short value: " + shortVar);
        System.out.println("int value: " + intVar);
        System.out.println("long value: " + longVar);
        System.out.println("float value: " + floatVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("boolean value: " + booleanVar);
        System.out.println("char value: " + charVar);
    }
}
