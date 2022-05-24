package Recursions.DecimalToBianry;
/*
      How to convert a number from Decimal to Binary using recursion
          
         
*/

public class RecursionInterview4 {
    public static void main(String[] args) {

        System.out.println(recursionDecimalToBinary(48));

    }

    public static int recursionDecimalToBinary(int n) {
        if (n < 0) { // unintentional case
            return -1;
        }

        if (n == 0) { // base case
            return n;
        }

        return n % 2 + 10 * recursionDecimalToBinary(n / 2); // convert a number from decimaal to binary using recursion

    }
}
