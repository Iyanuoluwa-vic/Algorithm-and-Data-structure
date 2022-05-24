package Recursions.GCD;
/*

    // How to find GCD ( Greatest Common Divisor) of two numbers using recursion
        gcd(a, b)= gcd(b, a mod b)  this use Euclidean algorithm 

        gcd(48,18)
        Step 1 : 48/18 = 2 remainder 12
        Step 2 : 18/12 = 1 remainder 6
        Step 3 : 12/6 = 2 remainder 0

                       ^
        gcd(18,48%18)  |
        gcd(12,18%12)  |    
        gcd(6,12%6)    |
       
        if(b==0) 
           return a;
*/

public class RecursionInterview3 {
    public static void main(String[] args) {

        System.out.println(recursionGCD(48, 18));

    }

    public static int recursionGCD(int a, int b) {
        if (b < 0) { // unintentional case
            return -1;
        }

        if (b == 0) { // base case
            return a;
        }

        return recursionGCD(b, a % b); // find GCD ( Greatest Common Divisor) of two numbers using recursion

    }
}
