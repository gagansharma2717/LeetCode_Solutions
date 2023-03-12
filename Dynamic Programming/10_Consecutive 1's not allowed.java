// https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1
// GFG -- Consecutive 1's not allowed

class Solution {
    int mod = 1000000007;

    long memo(int n , int prevDigit, long[][] dp){
        // base case
        if(n == 0) return 1; // empty string
        
        if(dp[n][prevDigit] != 0){
            return dp[n][prevDigit];
        }

        long appending0 = memo(n-1, 0, dp);
        long appending1 = (prevDigit == 0) ? memo(n-1, 1, dp) : 0; // if previous digit is 0 then you can make next call for 1 else simply take this state as 0
        
        return dp[n][prevDigit] = (appending0 + appending1) % mod;  
    }
    
    long countStrings(int n) {
        // n = number of digits
        long[][] dp = new long[n+1][2];
        return memo(n, 0, dp);
    }
}

