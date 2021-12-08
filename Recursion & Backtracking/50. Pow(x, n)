//Medium
class Solution {
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
    
    public double myPowHelper(double x, long n)
    {
        //Base case
        if(n == 0) return 1.0;
        
        //Calling n/2 
        double xnb2 = myPowHelper(x, n/2);
   
        double res;
        
        //If it is odd simply mulitply by x one more time
        if(n % 2 == 0)
        {
           res = xnb2 * xnb2;
        }
        else
        {
           res = xnb2 * xnb2 * x;
        }
        
        return res;
    }
}

//TC --> O(log2n)
