 # Interview Question 
  How to find GCD ( Greatest Common Divisor) of two numbers using recursion
 
 
 
 
 
 
 
 
 
 
 # Solution

        gcd(a, b)= gcd(b, a mod b)  this use Euclidean algorithm 
            
            a  b
        gcd(48,18)
        Step 1 : 48/18 = 2 remainder 12
        Step 2 : 18/12 = 1 remainder 6
        Step 3 : 12/6 = 2 remainder 0


        gcd(b,a/b)
                       
        gcd(18,48%18)  |
        gcd(12,18%12)  |    
        gcd(6,12%6)    |
       
        if(b==0) 
           return a;