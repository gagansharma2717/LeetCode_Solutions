// 31.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das1d-queen-chooses-official/ojquestion
// Converted 2d-Array to 1d-Array 
// Queens on Level

import java.io.*;
import java.util.*;

public class Main {

    public static void queensCombinations(int qpsf, int tq, Character[][] chess, int lastcellNo) {
        // When all queens are placed then print chess character array
        if(qpsf == tq)
        {
            for(int i = 0 ; i < tq; i++)
            {
                for(int j = 0 ; j < tq; j++)
                {
                    System.out.print(chess[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        
        // Aage ke sbhi cells or call lgayi
        for(int c = lastcellNo + 1 ; c < tq * tq ; c++)
        {
            //last cell se row and col no bnaya 
            int rowNo = c / tq; 
            int colNo = c % tq;
            
            // place queen
            chess[rowNo][colNo] = 'q';
            queensCombinations(qpsf + 1 , tq, chess, c);
            // unplace queen
            chess[rowNo][colNo] = '-';
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Character[][] chess = new Character[n][n];
        
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                chess[i][j] = '-';
            }
        }
        

        queensCombinations(0, n, chess, -1);
    }
}