// 42.
// PepCoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/nqueens-combinations-2das1d-queen-chooses-official/ojquestion

// In N-Queens combinations we need to check above only in 4 directions row , col , left diagonal & right diagonal 
import java.io.*;
import java.util.*;

public class Main {

    public static boolean IsQueenSafe(boolean[][] chess, int row, int col) {
       
       //row check
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == true){
                return false;
            }
        }
        
        //column check
        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        
        
        //Left Diagonal
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == true){
                return false;
            }
        }
        
        
        //Right Diagonal
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == true){
                return false;
            }
        }
        
        

        return true;
    }

    public static void nqueens(int qpsf, int tq, boolean[][] chess, int lcno) {
        // when saari queens place ho jaye
        // 2d array pr loop and if we found the queen then print q else "-"
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    System.out.print(chess[row][col] ? "q	" : "-	");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // last column se aage aage loop
        for (int i = lcno + 1; i < chess.length * chess.length; i++) {
            // converted 2d array into 1d 
            int row = i / chess.length; 
            int col = i % chess.length;

            // If uss place pr queen placed nhi h and queen ko place krna safe h toh queen ko place kiya next call lgai
            // call se aate hue unplace hi backtracking step
            if (chess[row][col] == false && IsQueenSafe(chess, row, col)) {
                chess[row][col] = true;
                nqueens(qpsf + 1, tq, chess, row * chess.length + col);
                chess[row][col] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        nqueens(0, n, chess, -1);
    }
}