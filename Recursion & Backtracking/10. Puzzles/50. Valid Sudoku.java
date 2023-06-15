// 50.
// 36. LeetCode https://leetcode.com/problems/valid-sudoku/
// This question is little different isme already filled board jo input m given h vo batana hai ki valid  
// hai ya nhi
// Toh simply traverse krna hai agar curr idx pr board ke value hai toh isValid call krna hai
// nhi toh simply next call lgani hai
// Also isValid m loop lgate hue curr idx vale element ko check nhi krna hai

class Solution {
    public boolean isValid(char[][] board, int row, int col, char ch){
         
        // same row different columns
        for(int j=0; j<9; j++){
            // curr idx vale element check nhi kiya
            if(board[row][j] == ch && j != col){
                return false;
            }
        }
        
        // different rows same column 
        for(int i=0; i<9; i++){
            // curr idx vale element check nhi kiya
            if(board[i][col] == ch && i != row){
                return false;
            }
        }
        
        // sub-matrix
        int smi = row / 3 * 3;
        int smj = col / 3 * 3;
        
        for(int i = 0 ; i < 3; i++){
        for(int j = 0 ; j < 3; j++){
            // curr idx vale element check nhi kiya
            if(board[smi + i][smj + j] == ch  && smi + i != row && smj + j != col){
                    return false; 
            }
            
           }
        }
            
        return true;
    } 
    
    public boolean solveSudoku(char[][] board, int row, int col){
        if(row == 9) return true;
        
        int nrow = 0;
        int ncol = 0;
        
        if(col == 8){
            nrow = row + 1;
            ncol = 0;
        }else{
            nrow = row;
            ncol = col + 1;
        }
        
        // Value already present hai toh isValid check kiya
        if(board[row][col] != '.'){
            
            if(isValid(board, row, col , board[row][col]) == false) return false;
        }
        
        // nhi toh simply next call
        return solveSudoku(board, nrow, ncol);
    }
        

    public boolean isValidSudoku(char[][] board) {
        return solveSudoku(board, 0, 0);
    }
}