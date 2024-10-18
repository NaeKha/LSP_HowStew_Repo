//To avoid plagirisim this question was answered with the help of google and AI. especially for java file importation and usage 
package org.howard.edu.lsp.midterm.question4;
import java.util.HashMap;
public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through the first map
        for (String key : map1.keySet()) {
            // Check if the key exists in the second map and the values match
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++; // Increment count for each common key/value pair
            }
        }
        return commonCount; // Return the total count of common pairs
    }
}
/*
 * MapUtilities class provides utility methods for working with HashMaps.
 * It contains a method to count common key/value pairs in two HashMaps.
 */