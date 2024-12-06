package org.howard.edu.lsp.finalexam.question2;

/**
 * Custom random number generator using a linear congruential generator algorithm.
 */

public class CustomRandomNumberGenerator implements RandomNumberStrategy {
	private long seed;

    /**
     * Constructor to initialize the seed for the custom generator.
     * @param seed the initial seed value for the random number generator
     */
    public CustomRandomNumberGenerator() {
        // Use system time to generate a dynamic seed each time the object is created
        this.seed = System.currentTimeMillis();
    }

    /**
     * Generates a random positive integer using a custom algorithm.
     * @return a positive integer
     */
    @Override
    public int generateRandomNumber() {
        // Linear congruential generator (LCG) constants
        final long a = 1664525;
        final long c = 1013904223;
        final long m = (1L << 32); // 2^32

        seed = (a * seed + c) % m;
        return Math.abs((int) seed);
    }
}

//StackOverflow, GeeksforGeeks, and AI assisted answers

