package mypack;

public class CarExecutor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Tata";
        c1.color = "Blue";
        c1.year = 2024;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.color = "Red";
        c2.year = 2023;

        c1.display();
        c2.display();
    }
}