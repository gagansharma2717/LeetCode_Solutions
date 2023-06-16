// 52. LeetCode https://leetcode.com/problems/n-queens-ii/

class Solution {
    public int nQueens(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag){
        int n = board.length;
        if(row == n){
           return 1;
        }
        
        int count = 0;
        for(int col = 0 ; col < board[0].length; col++){
            if(cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length-1] == false){
                
                board[row][col] = true;
                cols[col] = true ;
                ndiag[row + col] = true;
                rdiag[row - col + board.length-1] = true;
                
                count += nQueens(board, row + 1, cols, ndiag, rdiag);
                
                board[row][col] = false;
                cols[col] = false ;
                ndiag[row + col] = false;
                rdiag[row - col + board.length-1] = false;
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        
       
        boolean[][] board = new boolean[n][n];
        boolean[] cols = new boolean[n];
        boolean[] ndiag = new boolean[2*n - 1 ];
        boolean[] rdiag = new boolean[2*n - 1 ];
        
        int res = nQueens(board, 0, cols, ndiag, rdiag);
        
        return res;
    }
}

// Using BitSet

class Solution {
    public int nQueens(boolean[][] board, int row, BitSet cols, BitSet ndiag, BitSet rdiag){
        int n = board.length;
        if(row == n){
           return 1;
        }
        
        int count = 0;
        for(int col = 0 ; col < board[0].length; col++){
            if(cols.get(col) == false && ndiag.get(row + col) == false && rdiag.get(row - col + n-1) == false){
                
                board[row][col] = true;
                cols.set(col, true);
                ndiag.set(row + col, true);
                rdiag.set(row - col + n-1, true);
                
                count += nQueens(board, row + 1, cols, ndiag, rdiag);
                
                board[row][col] = false;
                cols.set(col, false);
                ndiag.set(row + col, false);
                rdiag.set(row - col + n-1, false);
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        
       
        boolean[][] board = new boolean[n][n];
        BitSet cols = new BitSet(n);
        BitSet ndiag = new BitSet(2*n - 1 );
        BitSet rdiag = new BitSet(2*n - 1 );
        
        int res = nQueens(board, 0, cols, ndiag, rdiag);
        
        return res;
    }
}