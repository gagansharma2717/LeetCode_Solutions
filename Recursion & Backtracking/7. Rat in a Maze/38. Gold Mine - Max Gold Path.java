// 38.
// 1219. LeetCode Medium https://leetcode.com/problems/path-with-maximum-gold/
// Flood Fill Alike just need to collect gold 

class Solution {
    int[] x = {0,0,-1,1};
    int[] y = {-1,1,0,0};
    public int dfs(int sr, int sc, int[][] grid){
       // Negative Base Case 
       if( sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] == 0 || grid[sr][sc] == -1)         {
            return 0;
        }

         // Taking value for backtracking  
         int val = grid[sr][sc];
         // Mark that index as visited
         grid[sr][sc] = -1;
         
         // To collect gold
         int maxGold = 0;
         
         // make 4 calls in 4 directions and take maximum gold coming out of 4 directions
         for(int i = 0; i < 4; i++) {
             maxGold = Math.max(maxGold, dfs(sr + x[i], sc + y[i], grid));
         }

         //backtracking step 
         grid[sr][sc] = val;

        // adding current index gold from grid in maximum gold and return    
        return maxGold + grid[sr][sc];
    }
    public int getMaximumGold(int[][] grid) {
        
        int maxGold = 0 ;
        
        // Go to each index of grid
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[0].length; j++){
                // make the call to collect gold and compare it with previously collected gold and whatever is maximum we will return it at the end
                int currAns = dfs(i,j,grid);
                maxGold = Math.max(currAns, maxGold);
            }
        }
        
        return maxGold;
    }
}