// 650. 2 Keys Keyboard
// https://leetcode.com/problems/2-keys-keyboard/

class Solution {
    public long memo(int screen , int buffer, long dest, long[][] dp){
        // -ve base case
        if(screen > dest) return Integer.MAX_VALUE;
        // +ve base case
        if(screen == dest) return 0;
        
        if(dp[screen][buffer] != -1l){
            return dp[screen][buffer];
        }
        
        // copy and paste in one step only  wahtever is present on screen\
        // we are doubling and this will take two steps
        long copyPaste = 2l + memo(2 * screen, screen, dest, dp);
        // paste from buffer into screen
        long paste = 1l + memo(screen + buffer, buffer, dest, dp);
        
        return dp[screen][buffer] = Math.min(paste, copyPaste);
    }
    public int minSteps(int n) {
        if(n == 1) return 0;
        
        long[][] dp = new long[2 * n + 1][2 * n + 1];
        for(int i = 0 ; i <= 2*n; i++){
            for(int j = 0; j <= 2*n; j++){
                dp[i][j] = -1;
            }
        }
        
        // 1l + is the initial copy step that's why we have 1 in buffer also
        return (int) (1l + memo(1, 1, n, dp));
    }
}

