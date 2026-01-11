package com.avn.tns.lamda;

import org.junit.jupiter.api.*;

public class TestLifeCycleDemo {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each Test");
    }

    @Test
    void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test
    void testCase2() {
        System.out.println("Test Case 2");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each Test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All Tests");
    }
}
