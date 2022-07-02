// 30. 
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-official/ojquestion
// Queen Chooses

import java.io.*;
import java.util.*;

public class Main {

    // qpsf --> queens placed so far
    // tq --> total queens
    // lastQRow --> last Queen Row
    // LastQCol --> Last Queen Column
    public static void queensCombinations(int qpsf, int tq, Character[][] chess, int lastQRow,int lastQCol){
        // Positive Base Case
        // When queen placed so far is equal to total queens
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
        
        //Current row m aage k columns pr 
        for(int j = lastQCol + 1 ; j < tq; j++)
        {
              
            chess[lastQRow][j] = 'q';
            queensCombinations(qpsf + 1, tq ,chess ,lastQRow , j);
            chess[lastQRow][j] = '-';
              
        }
        
        //Aage vali Row pr hi calls lgani h and usme saare cols pr
        for(int i = lastQRow + 1 ; i < tq; i++)
        {
            for(int j = 0 ; j < tq; j++)
            {
       
                chess[i][j] = 'q';
                queensCombinations(qpsf + 1, tq, chess, i , j);
                chess[i][j] = '-';
            }
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
        
        
        queensCombinations(0, n, chess, 0, -1);
    }
}