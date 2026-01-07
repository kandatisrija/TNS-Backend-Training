package com.avn.tns.lamda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Cal {
    int add(int a, int b);
}

public class LamdaDemo {

    public static void main(String[] args) {

        // Lambda Expression
        Cal c = (a, b) -> a + b;
        System.out.println(c.add(23, 2));

        // Stream API
        List<Integer> l = Arrays.asList(1, 2, 2, 3, 4, 5);
        l.stream()
         .distinct()
         .forEach(System.out::println);

        // Date & Time API
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
    }
}
