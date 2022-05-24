package Recursions.PowerOfNumber;

/**
 * How to calculate power of a number using recursion?
 * x^n = x * x^(n-1)
 * 
 * 
 */

public class RecursionInterview2 {
    public static void main(String[] args) {

        System.out.println(recursionPower(2, 3));

    }

    public static int recursionPower(int n, int power) {
        if (n < 0) { // unintentional case
            return -1;
        }

        if (power == 0) { // base case
            return 1;
        }

        return n * recursionPower(n, power - 1); // caluclate the power of numbers using recursion

    }

}
