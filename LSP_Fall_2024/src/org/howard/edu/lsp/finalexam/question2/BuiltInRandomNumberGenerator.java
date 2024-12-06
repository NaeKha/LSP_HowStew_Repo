package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random class.
 */

public class BuiltInRandomNumberGenerator implements RandomNumberStrategy {
	private Random random;
	/**
     * Constructor to initialize the Random object.
     */
    public BuiltInRandomNumberGenerator() {
        this.random = new Random();
    }
    /**
     * Generates a random number using Java's built-in random number generator.
     */
    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}

//StackOverflow, GeeksforGeeks, and AI assisted answers