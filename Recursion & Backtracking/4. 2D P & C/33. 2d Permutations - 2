// 33.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-permutations-2das2d-queen-chooses-official/ojquestion
// Queens on Level

import java.io.*;
import java.util.*;

public class Main {

    public static void queensPermutations(int qpsf, int tq, int[][] chess){
        // When all queens are placed 
        // run loop on 2d array and if find 0 print tab else queen no
        if(qpsf == tq){
            for(int i = 0; i < chess.length; i++){
                for(int j = 0 ; j < chess[0].length; j++){
                    if(chess[i][j] == 0){
                        System.out.print("-\t");
                    }else{
                        System.out.print("q" + chess[i][j] + "\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        
        // Checking each box if queen is not placed there place the queen and 
        // make next call and backtrack it while coming back
        for(int i = 0; i < chess.length; i++){
            for(int j = 0 ; j < chess[0].length; j++){
                if(chess[i][j] == 0){
                    chess[i][j] = (qpsf+1);
                    queensPermutations(qpsf+1, tq, chess);
                    chess[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensPermutations(0, n, chess);
    }
}