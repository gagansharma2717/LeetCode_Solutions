// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climbStairsMemo(n, dp);
    }
    
    public int climbStairsMemo(int n , int[] dp){
        if(n == 0) return 1; // There is one path from 0 to 0 that is empty string
        
        if(n < 0) return 0; // No paths from -1,-2 to 0
        
        // memoization
        if(dp[n] != -1){
            return dp[n];
        }
        
        // jumps
        int cnt1 = climbStairsMemo(n-1 , dp);
        int cnt2 = climbStairsMemo(n-2 , dp);
        
        // storing ans in dp array
        int ans = cnt1 + cnt2 ;
        dp[n] = ans;
        
        return ans;
    }
}

// O(n) - TC & SC

// Tabulation
class Solution {
    public int climbStairs(int n) {
        if(n < 0) return 0;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
   
}