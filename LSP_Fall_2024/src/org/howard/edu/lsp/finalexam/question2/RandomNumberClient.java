package org.howard.edu.lsp.finalexam.question2;

/**
 * Client program that demonstrates the usage of different random number generation strategies.
 */


public class RandomNumberClient {
	public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use BuiltInRandomNumberGenerator strategy
        service.setStrategy(new BuiltInRandomNumberGenerator());
        System.out.println("Random number (Built-in): " + service.generateRandomNumber());

        // Use CustomRandomNumberGenerator strategy with a seed value
        service.setStrategy(new CustomRandomNumberGenerator());
        System.out.println("Random number (Custom): " + service.generateRandomNumber());
    }
}

//StackOverflow, GeeksforGeeks, and AI assisted answers