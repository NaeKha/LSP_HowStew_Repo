package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestIntegerSet {
	private IntegerSet set1;
    private IntegerSet set2;

 // Run before each test
    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet(new ArrayList<>());
        set2 = new IntegerSet(new ArrayList<>());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(0, set1.length(), "Length should be 0 for empty set.");
        set1.add(1);
        assertEquals(1, set1.length(), "Length should be 1 after adding an element.");
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.clear();
        assertEquals(0, set1.length(), "Set should be cleared and have length 0.");
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        set1.add(1);
        set2.add(1);
        assertTrue(set1.equals(set2), "Sets should be equal if they contain the same elements.");
        set2.add(2);
        assertFalse(set1.equals(set2), "Sets should not be equal if they contain different elements.");
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain the element.");
        assertFalse(set1.contains(2), "Set should not contain an element that hasn't been added.");
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws Exception {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(3, set1.largest(), "Largest element should be 3.");
    }

    @Test
    @DisplayName("Test case for largest when empty")
    public void testLargestEmpty() {
        assertThrows(Exception.class, () -> set1.largest(), "Exception should be thrown when set is empty.");
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws Exception {
        set1.add(1);
        set1.add(3);
        set1.add(2);
        assertEquals(1, set1.smallest(), "Smallest element should be 1.");
    }

    @Test
    @DisplayName("Test case for exception when largest is called on an empty set")
    public void testLargestException() {
        IntegerSet set = new IntegerSet(null);
        assertThrows(Exception.class, () -> set.largest(), "An exception should be thrown when the set is empty");
    }
    @Test
    @DisplayName("Test case for exception when smallest is called on an empty set")
    public void testSmallestException() {
        IntegerSet set = new IntegerSet(null);
        assertThrows(Exception.class, () -> set.smallest(), "An exception should be thrown when the set is empty");
    }
    
    @Test
    @DisplayName("Test case for smallest when empty")
    public void testSmallestEmpty() {
        assertThrows(Exception.class, () -> set1.smallest(), "Exception should be thrown when set is empty.");
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        set1.add(1);
        assertTrue(set1.contains(1), "Set should contain 1 after adding.");
        set1.add(1); // Adding the same element
        assertEquals(1, set1.length(), "Set should not contain duplicates.");
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        set1.add(1);
        set1.remove(1);
        assertFalse(set1.contains(1), "Set should not contain 1 after removal.");
        set1.remove(2); // Trying to remove an element not in the set
        assertEquals(0, set1.length(), "Set should remain empty.");
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1), "Set should contain 1 after union.");
        assertTrue(set1.contains(2), "Set should contain 2 after union.");
        assertTrue(set1.contains(3), "Set should contain 3 after union.");
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2), "Set should contain 2 after intersection.");
        assertFalse(set1.contains(1), "Set should not contain 1 after intersection.");
        assertFalse(set1.contains(3), "Set should not contain 3 after intersection.");
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        assertTrue(set1.contains(1), "Set should contain 1 after difference.");
        assertFalse(set1.contains(2), "Set should not contain 2 after difference.");
        assertFalse(set1.contains(3), "Set should not contain 3 after difference.");
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        IntegerSet result = set1.complement(set2);
        assertTrue(result.contains(3), "Complement should contain 3.");
        assertFalse(result.contains(1), "Complement should not contain 1.");
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty(), "Set should be empty initially.");
        set1.add(1);
        assertFalse(set1.isEmpty(), "Set should not be empty after adding an element.");
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        assertEquals("[1, 2]", set1.toString(), "String representation should match the expected format.");
    }
 
}
