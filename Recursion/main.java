package Recursion;

public class main {
    public static void main(String[] args) {
        recursivemethod(5);
    }

    public static void recursivemethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursivemethod(n - 1);
            System.out.println(n);
        }
    }
}