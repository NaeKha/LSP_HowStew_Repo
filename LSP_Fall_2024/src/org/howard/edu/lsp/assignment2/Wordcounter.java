
package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Wordcounter {

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Create an instance of WordCounter and start processing the file
        Wordcounter counter = new Wordcounter();
        counter.processFile();
    }

    // Method to process the input file and count the occurrences of each non-trivial word
    public void processFile() {
        // HashMap to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Try-with-resources to automatically close the BufferedReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("words.text")))) {
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Echo the input line to the console
                System.out.println(line);

                // Split the line into words using a regular expression that matches any non-letter characters
                String[] words = line.split("[^a-zA-Z]+");

                // Iterate over each word in the line
                for (String word : words) {
                    // Convert the word to lowercase to ensure case insensitivity
                    word = word.toLowerCase();

                    // Check if the word is non-trivial (i.e., longer than 3 letters)
                    if (word.length() > 3) {
                        // Update the word count in the HashMap
                        // If the word already exists, increment its count by 1
                        // If the word doesn't exist, add it to the HashMap with an initial count of 1
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }

        // Output the word counts to the console
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            // Print each word and its corresponding count
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


