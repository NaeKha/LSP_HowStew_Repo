package org.howard.edu.lsp.finalexam.question2;


/**
 * Singleton class that provides random number generation service.
 */

public class RandomNumberService {
	private static RandomNumberService instance;
    private RandomNumberStrategy strategy;
    /**
     * Private constructor to prevent instantiation.
     */
    private RandomNumberService() {}

    /**
     * Returns the singleton instance of the RandomNumberService.
     * 
     * @return the singleton instance
     */
    
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }
    /**
     * Sets the strategy to be used for random number generation.
     * 
     * @param strategy the strategy to be used
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }
    /**
     * Generates a random number using the selected strategy.
     * 
     * @return a positive random integer
     */

    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set.");
        }
        return strategy.generateRandomNumber();
    }
}

//StackOverflow, GeeksforGeeks, and AI assisted answers