package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A class that models a mathematical set containing integers. 
 * It provides operations such as union, intersection, and difference.
 */
public class IntegerSet {
	 private List<Integer> set = new ArrayList<>();

	 /**
	  * Constructs an IntegerSet with the specified initial values.
	  *
	  * @param initialValues an ArrayList of integers to initialize the set
	  */
	    public IntegerSet(ArrayList<Integer> initialValues) {
	    	// constructor implementation
	    }

	    /**
	     * Clears the internal set, removing all elements.
	     */
	    public void clear() {
	        set.clear();
	    }

	    /**
	     * Returns the number of elements in the set.
	     * @return size of the set.
	     */
	    public int length() {
	        return set.size();
	    }

	    /**
	     * Compares this set to another IntegerSet for equality.
	     * Two sets are equal if they contain the same elements, regardless of order.
	     * @param o the object to compare.
	     * @return true if both sets are equal, false otherwise.
	     */
	    @Override
	    public boolean equals(Object o) {
	        if (o instanceof IntegerSet) {
	            IntegerSet otherSet = (IntegerSet) o;
	            return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
	        }
	        return false;
	    }

	    /**
	     * Checks if the set contains the given value.
	     * @param value the value to check.
	     * @return true if the set contains the value, false otherwise.
	     */
	    public boolean contains(int value) {
	        return set.contains(value);
	    }

	    /**
	     * Finds the largest element in the set.
	     * @return the largest element.
	     * @throws Exception if the set is empty.
	     */
	    public int largest() throws Exception {
	        if (set.isEmpty()) {
	            throw new Exception("The set is empty.");
	        }
	        return Collections.max(set);
	    }

	    /**
	     * Finds the smallest element in the set.
	     * @return the smallest element.
	     * @throws Exception if the set is empty.
	     */
	    public int smallest() throws Exception {
	        if (set.isEmpty()) {
	            throw new Exception("The set is empty.");
	        }
	        return Collections.min(set);
	    }
	    /**
	     * Computes the complement of this set with respect to another IntegerSet.
	     * This method retains all elements not present in this set but present in the other set.
	     *
	     * @param intSetb the other IntegerSet to compute the complement against.
	     */
	    public void complement(IntegerSet intSetb) {
	        for (Integer item : intSetb.set) {
	            if (!this.set.contains(item)) {
	                this.set.add(item);
	            }
	        }
	    }


	    /**
	     * Adds a new element to the set if it is not already present.
	     * @param item the integer to add.
	     */
	    public void add(int item) {
	        if (!set.contains(item)) {
	            set.add(item);
	        }
	    }

	    /**
	     * Removes the specified element from the set.
	     * @param item the integer to remove.
	     */
	    public void remove(int item) {
	        set.remove(Integer.valueOf(item));
	    }

	    /**
	     * Computes the union of this set with another IntegerSet.
	     * Adds any elements from the other set that are not already present.
	     * @param intSetb the other IntegerSet to union with.
	     */
	    public void union(IntegerSet intSetb) {
	        for (Integer item : intSetb.set) {
	            if (!this.set.contains(item)) {
	                this.set.add(item);
	            }
	        }
	    }

	    /**
	     * Computes the intersection of this set with another IntegerSet.
	     * Retains only elements that are present in both sets.
	     * @param intSetb the other IntegerSet to intersect with.
	     */
	    public void intersect(IntegerSet intSetb) {
	        this.set.retainAll(intSetb.set);
	    }

	    /**
	     * Computes the difference between this set and another IntegerSet.
	     * Removes elements from this set that are present in the other set.
	     * @param intSetb the other IntegerSet to find the difference with.
	     */
	    public void diff(IntegerSet intSetb) {
	        this.set.removeAll(intSetb.set);
	    }

	    /**
	     * Checks if the set is empty.
	     * @return true if the set is empty, false otherwise.
	     */
	    public boolean isEmpty() {
	        return set.isEmpty();
	    }

	    /**
	     * Returns a string representation of the set.
	     * @return the string representation.
	     */
	    @Override
	    public String toString() {
	        return set.toString();
	    }
	}
