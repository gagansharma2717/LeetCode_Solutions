class Solution {
    int[][] dirs = {{0,1}, {0,-1},{1,0},{-1,0}};
    
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        
        for(int i = 0 ; i < col ; i++)
        {
//             Oth row ke har column ke liye
            dfs(matrix,0,i,Integer.MIN_VALUE,pacific);
//             last row ke har column ke liye
            dfs(matrix,row-1,i,Integer.MIN_VALUE,atlantic);
        }
        
        for(int i = 0 ; i < row ; i++)
        {
            dfs(matrix,i,0,Integer.MIN_VALUE,pacific);
            dfs(matrix,i,col-1,Integer.MIN_VALUE,atlantic);
        }
        
        for(int i = 0 ; i < row; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        
        return res;
    }
    
    
    public void dfs(int[][] matrix, int i, int j , int prev, boolean[][] ocean){
//         Out of Bound
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length){
            return;
        }
        
//         Current val is smaller than prev or In array already true is present at that index
        if(matrix[i][j] < prev || ocean[i][j])
        {
            return;
        }
        
        ocean[i][j] = true;
        
        for(int[] d : dirs)
        {
//             calls in all 4 directions
            dfs(matrix, i + d[0], j + d[1],matrix[i][j],ocean);
        }
        
    }
}