https://leetcode.com/problems/number-of-islands/submissions/

class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        int island_count = 0;
        
        boolean[][] visited = new boolean[n][m];
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(!visited[i][j] && grid[i][j] == '1')
                {
                    dfs(grid,i,j,visited);
                    island_count++;
                }
            }
        }
        
        return island_count;
    }
    
    public void dfs(char[][] grid, int i , int j , boolean[][] visited)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0' || visited[i][j] == true)
        {
            return;
        }
        
        visited[i][j] = true;
        
        dfs(grid,i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i ,j-1,visited);
        
    }
}