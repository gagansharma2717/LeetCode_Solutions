// 24.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/coin-change-combinations-1-official/ojquestion
// Repetition Not Allowed

import java.io.*;
import java.util.*;

public class Main {
    // Give Every Coin Choice if coin want to come in answer or not and when all coins are finished
    // and Whose combinations sum is equal to target we will print that combination.

    public static void coinChange(int i, int[] coins, int amtsf, int tamt, String asf){
        // Base Case
        // When all coins are traversed and amount so far is equal to given target
        if(i == coins.length){
            if(amtsf == tamt){
                System.out.println(asf + ".");
            }
            return;
        }

        //yes
        coinChange(i+1, coins, amtsf + coins[i], tamt, asf + coins[i] + "-");
        //no
        coinChange(i+1, coins, amtsf, tamt, asf);
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int amt = Integer.parseInt(br.readLine());
        
        coinChange(0, coins, 0, amt, "");
    }
}