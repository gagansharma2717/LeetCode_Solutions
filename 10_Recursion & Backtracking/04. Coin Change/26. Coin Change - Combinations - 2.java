// 26.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/coin-change-combinations-2-official/ojquestion
// Repetition Allowed

import java.io.*;
import java.util.*;

public class Main {

    public static void coinChange(int i, int[] coins, int amtsf, int tamt, String asf) {
        if(i == coins.length){
            if(amtsf == tamt){
                System.out.println(asf + ".");
            }
            return;
        }
        
        // Reverse loop to match the output and we can run the loop for particular times till the target / coins[i] is smaller than 1.
        // e.g 12 and coins[i] = 2
        // 12 / 2 = 6 . So, this loop will run 6 times for these values.    
        for(int j = tamt/coins[i]; j >= 1 ; j--)
        {
            // This string is to take the coins multiple times less than k
            String part = "";
            for(int k = 0; k < j ; k++){
                part += coins[i] + "-";
            }
            
            // yes
            coinChange(i+1, coins, amtsf + coins[i] * j, tamt, asf + part);
        }
        
        // no
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