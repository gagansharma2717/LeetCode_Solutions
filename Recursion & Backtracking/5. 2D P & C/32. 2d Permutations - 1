// 32.
// PepCoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-permutations-2das2d-box-chooses-official/ojquestion
// Box on Level
import java.io.*;
import java.util.*;

public class Main {

    public static void queensPermutations(int qpsf, int tq, int row, int col, String asf, boolean[] queens) {
        // Positive Base Case
        // When all rows are visited and all queens are placed 
        if(row == queens.length){
            if(qpsf == tq){
                System.out.println(asf + " ");
                System.out.println();
            }
            return;
        }
        
        //new row and new column
        int nrow = 0 ; 
        int ncol = 0 ; 
        char sep = '\0'; // separator
        
        // When done with all the columns of current row and then increase row
        // and set column to 0 and update separator for formatting
        // else simple updates the column and separator
        if(col == tq-1){
            nrow = row+1;
            ncol = 0;
            sep = '\n';
            
        }else{
            nrow = row;
            ncol = col+1;
            sep = '\t';
        }
        
        // Visited all queens if it is not placed then place queen and make the next call and backtrack it 
        for(int i = 0 ; i < queens.length; i++){
            if(queens[i] == false){
                queens[i] = true;
                queensPermutations(qpsf+1, tq, nrow, ncol, asf + "q" + (i + 1) + sep, queens);
                queens[i] = false;
            }
        }
        
        // No call because boxes are more than queens
        queensPermutations(qpsf, tq, nrow, ncol, asf + "-" + sep, queens);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];

        queensPermutations(0, n, 0, 0, "", queens);
    }
}
