//Convert an array to reduced form 


// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static class Pair implements Comparable<Pair>
    {
        int val;
        int idx; 
        
        Pair(int val, int idx)
        {
            this.val = val;
            this.idx = idx;
        }
        
        public int compareTo(Pair other)
        {
            return this.val - other.val;
        }
    }
    void convert(int[] arr, int n) {
        
        Pair[] sorted = new Pair[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            sorted[i] = new Pair(arr[i] , i);
        }
        
        Arrays.sort(sorted);
        
        for(int i = 0 ; i < n ; i++)
        {
            arr[sorted[i].idx] = i;
        }
        
        
    }
}
