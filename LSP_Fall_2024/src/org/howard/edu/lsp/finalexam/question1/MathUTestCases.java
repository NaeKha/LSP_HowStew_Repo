
package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUTestCases {
    MathUtils mathUtils = new MathUtils();

    // Test cases for factorial method
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    public void testFactorialThrowsExceptionForNegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    // Test cases for isPrime method
    @Test
    public void testIsPrimeForNonPrimeNumber() {
        assertFalse(mathUtils.isPrime(4), "4 is not a prime number");
    }

    @Test
    public void testIsPrimeForPrimeNumber() {
        assertTrue(mathUtils.isPrime(7), "7 is a prime number");
    }

    @Test
    public void testIsPrimeForNumbersLessThanOrEqualToOne() {
        assertFalse(mathUtils.isPrime(1), "1 is not a prime number");
        assertFalse(mathUtils.isPrime(0), "0 is not a prime number");
        assertFalse(mathUtils.isPrime(-5), "-5 is not a prime number");
    }

    // Test cases for gcd method
    @Test
    public void testGcdForPositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should be 6");
    }

    @Test
    public void testGcdWhenOneNumberIsZero() {
        assertEquals(5, mathUtils.gcd(5, 0), "GCD of 5 and 0 should be 5");
        assertEquals(7, mathUtils.gcd(0, 7), "GCD of 0 and 7 should be 7");
    }

    @Test
    public void testGcdThrowsExceptionForBothNumbersZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
        assertEquals("Both numbers cannot be zero", exception.getMessage());
    }

    @Test
    public void testGcdForNegativeNumbers() {
        assertEquals(4, mathUtils.gcd(-8, -12), "GCD of -8 and -12 should be 4");
    }
}

// StackOverflow, GeeksforGeeks, and AI assisted answers