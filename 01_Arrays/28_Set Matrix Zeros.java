class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        boolean firstRow = false, firstCol = false;

        //first col
        for(int i = 0 ; i < n; i++){
          if(matrix[i][0] == 0){
            firstCol =true;
          }
        }

        // first row
        for(int j = 0 ; j < m ; j++){
          if(matrix[0][j] == 0){
            firstRow = true;
          }
        }

        // Identifying 0's apart from first row and first col 
        // If found set that corresping col and row 0th index to 0
        for(int i = 1 ; i < n; i++){
          for(int j = 1 ; j < m ; j++){
             if(matrix[i][j] == 0){
                matrix[i][0] = 0;
                matrix[0][j] = 0;
             }
          }
        }

        // Filling 0's in row from 1st index
        for(int i = 1 ; i < n ; i++){
          if(matrix[i][0] == 0){
            for(int j = 0 ; j < m ; j++){
              matrix[i][j] = 0;
            }
          }
        }

        // Filling 0's in col from 1st index
        for(int j = 1 ; j < m ; j++){
          if(matrix[0][j] == 0){
            for(int i = 0; i < n; i++){
              matrix[i][j] = 0;
            }
          }
        }

        // if firstrow is true then filling zeros in first row
        if(firstRow){
            for(int j = 0 ; j <m ; j++){
              matrix[0][j] = 0;
            }  
        }
        
        // if firstcol is true then fill 0's in first col 
        if(firstCol){
          for(int i = 0 ; i < n ; i++){
            matrix[i][0] = 0;
          }
        }
    }
}

TC - O(n*m)
SC - O(1)

