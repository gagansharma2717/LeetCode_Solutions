class Solution {
    public int uniquePathsIII(int[][] grid) {
        
        int zero = 0 , sx = 0 , sy = 0 ;
        
        for(int i = 0 ; i < grid.length; i++)
        {
            for(int j = 0 ; j < grid[0].length; j++)
            {
                if(grid[i][j] == 0)
                {
                    zero++;
                }else if(grid[i][j] == 1)
                {
                    sx = i ;
                    sy = j;
                }
            }
        }
        
        return dfs(grid,sx,sy,zero);
    }
    
    public int dfs(int[][] grid, int x ,int y , int zeros){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1)
        {
            return 0;
        }
        
        if(grid[x][y] == 2)
        {
            return zeros == -1 ? 1 : 0;
        }
        
        
        grid[x][y] = -1;
        zeros--;
        
        int totalPaths = dfs(grid, x+1, y , zeros) + 
                         dfs(grid, x-1, y , zeros) +
                         dfs(grid, x, y+1 , zeros) +
                         dfs(grid, x, y-1 , zeros) ;
        
        grid[x][y] = 0;
        zeros++;
        
        return totalPaths;
    }
}