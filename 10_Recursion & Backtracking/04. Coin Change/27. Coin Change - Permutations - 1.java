// 27.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/coin-change-permutations-1-official/ojquestion
// Repetition not Allowed

import java.io.*;
import java.util.*;

public class Main {

    public static void coinChange(int[] coins, int amtsf, int tamt, String asf, boolean[] used){
       // Negative Base Case
       // When amount so far is greater than target 
       if(amtsf > tamt){
           return;
       }
        
        // Positive Base Case
        // Whem amount so far is equal to target
        if(amtsf == tamt){
            System.out.println(asf + ".");
            return;
        }       

        // Loop on every coin
        // If it is not used and mark as used and make a call and also add that coin in anwer so far and amount so far and backtrack it while coming back 
       for(int i = 0 ; i < coins.length; i++){
           if(used[i] == false){
               used[i] = true;
               coinChange(coins, amtsf + coins[i], tamt, asf + coins[i] + "-", used);
               used[i] = false;
           }
       }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        boolean[] used = new boolean[coins.length];
        coinChange(coins, 0, amt, "", used);
    }
}