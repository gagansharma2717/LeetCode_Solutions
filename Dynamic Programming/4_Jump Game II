// 45. Jump Game II
// https://leetcode.com/problems/jump-game-ii/

class Solution {
    public long memo(int src, int[] jumps, long[] dp){
        if(src == jumps.length-1){
            return 0; //min moves to reach dest from dest (empty string)
        }
        
        // memoization check
        if(dp[src] != -1){
            return dp[src];
        }
        
        long min = Integer.MAX_VALUE; 
        // long to avoid storage issue for infinity + 1 will become minus infinity
        // Integer.MAX_VALUE is identity for min
        
        // src se jump
        for(int jump = 1; jump <= jumps[src] ; jump++){
            // if jump + src is in array you can make move
            if(jump + src < jumps.length){
                // calculate min from current min and next call + 1 khud ki move 
                min = Math.min(min, memo(src + jump, jumps, dp) + 1L);
            }
        }
        
        // memoization
        dp[src] = min;
        
        return min;
            
    }
    public int jump(int[] jumps) {
        long[] dp = new long[jumps.length+1];
        Arrays.fill(dp, -1);
        
        return (int) memo(0, jumps, dp);
    }
}