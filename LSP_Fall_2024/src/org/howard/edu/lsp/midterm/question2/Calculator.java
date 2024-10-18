// This question used online learning tools like Google, stack exchange, and AI for reference material and assistance 
package org.howard.edu.lsp.midterm.question2;
/* 
 * A utility class that provides methods to sum numbers of different types.
 *
 * The class includes:
 * - sum(int a, int b): Sums two integer values.
 * - sum(double a, double b): Sums two double values.
 * - sum(int[] numbers): Sums all elements in an array of integers.
 */
public class Calculator {
	public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
