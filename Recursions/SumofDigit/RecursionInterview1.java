package Recursions.SumofDigit;

/*
    How to find the sum of digits of a positive integer number using recursion 
     Rule
       -f(n) = n%10 + f(n/10)
       -Stop Case n=0
       -unintentional case (n<0)



*/
public class RecursionInterview1 {
    public static void main(String[] args) {

        System.out.println(recursionSum(98));

    }

    public static int recursionSum(int n) {
        if (n < 0) { // unintentional case
            return -1;
        }

        if (n == 0) { // base case
            return n;
        }

        return n % 10 + recursionSum(n / 10); // this sum up the digit of the recurion

    }

}
