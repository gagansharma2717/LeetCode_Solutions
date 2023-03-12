// 1.
// 50. - LeetCode Medium https://leetcode.com/problems/powx-n/

class Solution {
     public double myPowHelper(double x, long n)
    {
        //Base case
        if(n == 0) return 1.0;
        
        //Calling n/2 
        double xnb2 = myPowHelper(x, n/2);
   
        //If it is odd simply mulitply by x one more time
        if(n % 2 == 0)
        {
           return xnb2 * xnb2;
        } else {
           return xnb2 * xnb2 * x;
        }
    }

    public double myPow(double x, int n) {
       //Handling Negative Base
       if(n < 0)
       {
           
           double temp = myPowHelper(x, -1l * n);
           //Dividing by 1.0 
           return 1.0 / temp;
       }
        //Now simply call helper method
         return myPowHelper(x,n);
    }
}

//TC --> O(log2n)


// PepCoding https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-linear-official/ojquestion

package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = powerLinear(x,n);
        System.out.println(res);
    }

    private static int powerLinear(int x, int n) {
        if(n == 0)
        {
            return 1;
        }

        int xpn = powerLinear(x,n-1) * x;

        return xpn;
    }
}

//O(n)

// 2nd Approach https://www.pepcoding.com/resources/online-java-foundation/introduction-to-recursion/power-logarithmic-official/ojquestion

package Recursion;

import java.util.Scanner;

public class PowerLogarthimic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = powerLogarthimic(x,n);
        System.out.println(res);
    }

    private static int powerLogarthimic(int x, int n) {
        if( n == 0)
        {
            return 1;
        }

        int xpnb2 = powerLogarthimic(x,n/2);

        int xpn = xpnb2 * xpnb2;

        if(n % 2 == 1 )
        {
            xpn *= x;
        }

        return xpn;
    }
}
//O(logn)