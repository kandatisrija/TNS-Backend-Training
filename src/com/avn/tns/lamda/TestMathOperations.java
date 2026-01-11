package com.avn.tns.lamda;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestMathOperations {

    @Test
    void testPositiveNumber() {
        assertTrue(MathOperations.positiveNumber(10));
    }

    @Test
    void testNegativeNumber() {
        assertFalse(MathOperations.positiveNumber(-5));
    }

    @Test
    void testZero() {
        assertFalse(MathOperations.positiveNumber(0));
    }
}
