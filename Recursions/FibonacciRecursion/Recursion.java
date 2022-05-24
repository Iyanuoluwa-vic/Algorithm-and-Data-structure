package Recursions.FibonacciRecursion;

public class Recursion {
    /*
     * -Recursion is the calling of function several times
     * -used to break down big problem into smaller one
     * This recursion iterate through a number
     * 
     * this
     */

    public static void main(String[] args) {
        recursivemethod(5);
    }

    public static void recursivemethod(int n) {
        if (n < 1) { // exit from the infinite loop
            System.out.println("n is less than 1");
        } else {
            recursivemethod(n - 1); // it recursivelly calls it self serveral times till it reach less than 1 which
                                    // provided a termination to the recursion
            System.out.println(n);
        }
    }
}

/*
 * Stack memory output
 * -------------------------------------------------
 * recursiveMethod(1) n less than 1
 * recursiveMethod(2) 1
 * recursiveMethod(3) 2
 * recursiveMethod(3) 3
 * recursiveMethod(4) 4
 * 
 * 
 * 
 */