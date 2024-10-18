package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
	public static void main(String[] args) {
        VotingMachine vm = new VotingMachine(); // Create a new VotingMachine instance
        vm.addCandidate("Alsobrooks"); // Add a candidate
        vm.castVote("Alsobrooks"); // Cast a vote for the candidate
        vm.addCandidate("Hogan"); // Add another candidate

        System.out.println(vm.toString()); // Print out the votes for each candidate
    }
}
/*
 * VotingMachineDriver class serves as the main driver to demonstrate the functionality of the VotingMachine class.
 *
 * - Creates an instance of VotingMachine.
 * - Adds candidates and casts votes.
 * - Prints the results.
 */