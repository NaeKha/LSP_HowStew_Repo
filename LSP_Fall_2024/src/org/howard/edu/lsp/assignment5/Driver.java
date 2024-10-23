package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
/**
 * Driver class to test the functionality of the IntegerSet class.
 * It contains various test cases that demonstrate the operations of
 * adding, removing, and performing set operations on IntegerSet instances.
 */
public class Driver {
	// Default constructor
	
	/**
     * Default constructor for the Driver class.
     * Initializes a new instance of the Driver class.
     */
    public Driver() {
        // No initialization needed for the driver
    }
	    /**
	     * The main method to execute tests on the IntegerSet class.
	     * It creates multiple IntegerSet instances and tests methods
	     * such as add, remove, union, intersection, difference, and more.
	     *
	     * @param args command line arguments (not used)
	     */
	    public static void main(String[] args) {
	        // Test 1: Create an IntegerSet using the default constructor
	        IntegerSet setA = new IntegerSet(null);
	        System.out.println("Test 1: Default constructor, length: " + setA.length());

	        // Test 2: Add elements to setA
	        setA.add(5);
	        setA.add(10);
	        setA.add(15);
	        System.out.println("Test 2: Add elements to setA, length: " + setA.length());
	        System.out.println("Set A: " + setA);

	        // Test 3: Check contains
	        System.out.println("Test 3: Set A contains 10: " + setA.contains(10));
	        System.out.println("Test 3: Set A contains 20: " + setA.contains(20));

	        // Test 4: Largest and smallest
	        try {
	            System.out.println("Test 4: Largest in Set A: " + setA.largest());
	            System.out.println("Test 4: Smallest in Set A: " + setA.smallest());
	        } catch (Exception e) {
	            System.out.println("Test 4: " + e.getMessage());
	        }

	        // Test 5: Remove an element
	        setA.remove(10);
	        System.out.println("Test 5: Remove 10 from Set A, length: " + setA.length());
	        System.out.println("Set A: " + setA);

	        // Test 6: Clear the set
	        setA.clear();
	        System.out.println("Test 6: Clear Set A, length: " + setA.length());

	        // Test 7: Create another IntegerSet with elements
	        ArrayList<Integer> initialValues = new ArrayList<>();
	        initialValues.add(20);
	        initialValues.add(30);
	        IntegerSet setB = new IntegerSet(initialValues);
	        System.out.println("Test 7: Set B initialized with values, length: " + setB.length());
	        System.out.println("Set B: " + setB);

	        // Test 8: Union of sets
	        setA.union(setB);
	        System.out.println("Test 8: Union of Set A and Set B:");
	        System.out.println("Set A: " + setA);
	        System.out.println("Set B: " + setB);

	        // Test 9: Intersecting sets
	        IntegerSet setC = new IntegerSet(initialValues);
	        setC.add(30);
	        setC.add(40);
	        setA.intersect(setC);
	        System.out.println("Test 9: Intersection of Set A and Set C:");
	        System.out.println("Set A: " + setA);
	        System.out.println("Set C: " + setC);

	        // Test 10: Difference of sets
	        setA.diff(setB);
	        System.out.println("Test 10: Difference of Set A and Set B:");
	        System.out.println("Set A: " + setA);
	        System.out.println("Set B: " + setB);

	        // Test 11: Check if sets are empty
	        System.out.println("Test 11: Is Set A empty? " + setA.isEmpty());
	        System.out.println("Test 11: Is Set B empty? " + setB.isEmpty());

	        // Test 12: ToString representation of sets
	        System.out.println("Test 12: String representation of Set A: " + setA.toString());
	        System.out.println("Test 12: String representation of Set B: " + setB.toString());
	    }
}
