//This answers is influenced by AI and google, specifically AI suggested the use of importing the java files and making sure that they're referenced correctly throughout the code

package org.howard.edu.lsp.midterm.question3;
import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
	private Map<String, Integer> candidates; // Map to store candidate names and their corresponding vote counts

    public VotingMachine() {
        candidates = new HashMap<>(); // Initialize the candidates map
    }

    public void addCandidate(String name) {
        candidates.put(name, 0); // Initialize votes to 0 for the new candidate
    }

    public void castVote(String name) {
        if (candidates.containsKey(name)) { // Check if candidate exists before voting
            candidates.put(name, candidates.get(name) + 1); // Increment the vote count for the candidate
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n"); // Prepare result string
        }
        return result.toString(); // Return the result string
    }
}
/*
 * VotingMachine class provides a simplified voting machine functionality.
 *
 * - uses a HashMap to store candidate names and their vote counts.
 * - addCandidate(String name): Adds a candidate to the voting machine.
 * - castVote(String name): Casts a vote for the specified candidate.
 * - toString(): Returns a string representation of all candidates and their vote counts.
 */