package Recursion;

public class main {
    /*
     * -Recursion is the calling of function several times
     * -used to break down big problem into smaller one
     */

    public static void main(String[] args) {
        recursivemethod(5);
    }

    public static void recursivemethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursivemethod(n - 1); // it recursivelly calls it self serveral times till it reach less than 1 which
                                    // provided a termination to the recursion
            System.out.println(n);
        }
    }
}