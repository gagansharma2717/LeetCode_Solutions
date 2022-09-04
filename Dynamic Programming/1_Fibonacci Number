// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
        // recursive
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int prev1 = fib(n-1);
        int prev2 = fib(n-2);
        
        return prev1 + prev2;
    }
}
// exponential tc O(2^n) bcoz 2 calls calls ki power height + preorder m work + postorder m work

class Solution {
    public int fib(int n) {
       int[] dp = new int[n + 1];
       Arrays.fill(dp, -1); 
        
       return fibmemo(n, dp);
        
    }
    
    public int fibmemo(int n, int[] dp){
       // memoization
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        if(dp[n] != -1) {
            return dp[n];
        }
        
        int prev1 = fibmemo(n-1, dp);
        int prev2 = fibmemo(n-2, dp);
        
        int ans = prev1 + prev2;
        dp[n] = ans;
        return ans; 
    }
}

// O(n) - time and space

class Solution {
    // tabulation
    public int fib(int n) {
        if(n <= 1) return n;
        
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}
// O(n) time and space but saved recursion call stack space

class Solution {
    // two pointers
    public int fib(int n) {
        if(n <= 1) return n;
        
        int prev1  = 0;
        int prev2 = 1;
        
        for(int i = 2; i <= n ; i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        
        return prev2;
    }
}
// O(n) time and O(1) space