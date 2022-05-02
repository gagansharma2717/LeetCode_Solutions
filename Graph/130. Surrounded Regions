class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    
    public void solve(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
        
        for(int i = 0 ; i < row ; i++)
        {
//             Each row first column
            if(board[i][0] == 'O')
            {
                dfs(board,i ,0);
            }
            
//             Each row last column
            if(board[i][col-1] == 'O')
            {
                dfs(board,i,col-1);
            }
        }
        
        for(int i = 0 ; i < col ; i++)
        {
//             First row Each Columns
            if(board[0][i] == 'O')
            {
                dfs(board,0,i);
            }
//             Last row Each Columns
            if(board[row-1][i] == 'O')
            {
                dfs(board,row-1,i);
            }
            
        }
        
        for(int i = 0 ; i < row; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }
    
    public void dfs(char[][] board, int i , int j)
    {
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O')
        {
            return;
        }
        
        board[i][j] = '#';
        
        for(int[] d : dirs)
        {
            int r = i + d[0];
            int c = j + d[1];
            
            dfs(board,r,c);
        }
    }
}