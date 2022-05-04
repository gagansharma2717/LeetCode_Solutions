https://www.lintcode.com/problem/860/

public class Solution {
  
    public int numberofDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0 ; 

        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] == 1)
                {
                    StringBuilder sb =  new StringBuilder();
                    dfs(grid,n,m,i,j,"s",sb);
                    String islands = sb.toString();

                    if(!set.contains(islands))
                    {
                        set.add(islands);
                    }
                }
            }
        }
        
        return set.size();
    }


    public void dfs(int[][] grid , int n , int m , int i , int j , String dir, StringBuilder sb){
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 1)
        {
            return;
        }

        grid[i][j] = 0;
        sb.append(dir);
        dfs(grid,n,m,i+1,j,"d",sb);
        dfs(grid,n,m,i-1,j,"t",sb);
        dfs(grid,n,m,i,j+1,"r",sb);
        dfs(grid,n,m,i,j-1,"l",sb);
        sb.append("e");
    }
}