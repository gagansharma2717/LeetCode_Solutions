https://leetcode.com/problems/max-area-of-island/

class Solution {
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int max_area = 0;
        int area_count = 0;

        for(int i = 0; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 1)
                {
                    dfs(grid,i,j);
                    max_area = Math.max(count,max_area);
                    count = 0;
                }
            }
        }

        return max_area;
    }

    public void dfs(int[][] grid, int i , int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
        {
            return;
        }

        if(grid[i][j] == 1)
        {
            grid[i][j] = 0 ;
            count += 1;
            dfs(grid,i+1,j);
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
        }
    }
}