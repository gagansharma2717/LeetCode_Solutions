//43.
// PepCoding https://classroom.pepcoding.com/myClassroom/the-switch-program-4/recursion-&-backtracking-level-2/nqueens-permutations-2das1d-official-queen-chooses/ojquestion

// In N-Queens combinations we need to check in 8 directions  top rows , bottom rows, left cols , right cols, left diagonals & right diagonals & anti diagonals 
import java.io.*;
import java.util.*;

public class Main {

    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        // row up
        for (int i = row, j = col; i >= 0; i--) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        // row down
        for (int i = row, j = col; i < chess.length; i++) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        // col left
        for (int i = row, j = col; j >= 0; j--) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        // col right
        for (int i = row, j = col; j < chess.length; j++) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        //  left diagonal up
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        //  left diagonal down
        for (int i = row, j = col; i < chess.length && j < chess.length; i++, j++) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        // right diagonal up
        for (int i = row, j = col; i >= 0 && j < chess.length; i--, j++) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        // right-diagonal down
        for (int i = row, j = col; i < chess.length && j >= 0; i++, j--) {
            if(chess[i][j] > 0){
                return false;
            }
        }

        return true;
    }

    public static void nqueens(int qpsf, int tq, int[][] chess) {
        // when saari queens place ho jaye
        // 2d array pr loop and if we found the queen then print q and uss place pr jo value h else "-"
        if (qpsf == tq) {
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    System.out.print(chess[row][col] > 0 ? "q"+ chess[row][col] + "\t" : "-\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        // 2d array ke har place pr loop lgaya
        for (int i = 0; i < chess.length * chess.length; i++) {
            // converted 2d array into 1d 
            int row = i / chess.length;
            int col = i % chess.length;

             // If uss place pr queen placed nhi h and queen ko place krna safe h toh queen ko place kiya next call lgai
            // call se aate hue unplace hi backtracking step
            if (chess[row][col] == 0 && IsQueenSafe(chess, row, col)) {
                chess[row][col] = qpsf + 1;
                nqueens(qpsf + 1, tq, chess);
                chess[row][col] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];

        nqueens(0, n, chess);
    }
}


                        