package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Random number generator using Java's built-in Random class.
 */

public class BuiltInRandomNumberGenerator implements RandomNumberStrategy {
	private Random random;

    public BuiltInRandomNumberGenerator() {
        this.random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1;
    }
}
