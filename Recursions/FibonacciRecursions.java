package Recursions;
/*     
    Fibonacci recursion is sequence of number which each number is sum of two preceding ones and sequence start from 0 and 1
    
*/

public class FibonacciRecursions {
    public static void main(String[] args) {
        System.out.println(fibon(10));
    }

    public static int fibon(int n) {

        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fibon(n - 1) + fibon(n - 2);

    }
}
