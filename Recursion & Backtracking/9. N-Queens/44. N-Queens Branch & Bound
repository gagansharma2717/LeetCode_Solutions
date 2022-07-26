//44.
// PepCoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/nqueens-branch-and-bound-official/ojquestion

In this approach we will bound future cells in same column, normal diagonal (r+c) and reverse diagonal 
(r - c) + board.length-1 . board.length-1 is used because negative values ho jaati nhi toh r-c mai . For thius we will make three visited kind of arrays for same column , normal diagonal and reverse diagonal. Column array will be of size (n) and diagonals array will  be of (2 * n - 1) size.
So, we are using some space to decrease time complexity

import java.io.*;
import java.util.*;

public class Main {
    
  public static void solve(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag, String asf){
      
      // Positive Base case
      // When all rows are visited then simply print the answer 
      
      if(row == board.length){
          System.out.println(asf + ".");
          return;
      }
      
      // travese kiya columns pr if they are not visited in all three arrays
      // cols[col] = vo column viisted nhi h
      // ndiag = row + col visited nhi h
      // rdiag = row - col + board.length -1 pr visited nhi h 
      // toh queen place kro and teeno arrays m visited mark kro
      // next row pr call lgao
      // aate hu backtracking step queen ko unplace and teeno arrays m unvisited mark kiya 

      for(int col = 0 ; col < board[0].length; col++){
          if(cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length - 1] == false){
              board[row][col] = true;
              cols[col] = true;
              ndiag[row + col] = true;
              rdiag[row - col + board.length-1] = true;
              solve(board, row + 1,cols, ndiag, rdiag, asf + row + "-" + col + ", ");
              board[row][col] = false;
              cols[col] = false;
              ndiag[row + col] = false;
              rdiag[row - col + board.length-1] = false;
          }
      }
  }     
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // Main board
    boolean[][] board = new boolean[n][n];
    // Three Visited array for columns, normal diagonal and reverse diagonal
    boolean[] cols = new boolean[n];
    boolean[] ndiag = new boolean[2*n - 1];
    boolean[] rdiag = new boolean[2*n - 1];
    
    // 0 = first row , "" = answer so far
    solve(board, 0, cols, ndiag, rdiag, "");
    
  }

}