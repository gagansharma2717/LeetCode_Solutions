// 4.
// 77 - LeetCode Medium https://leetcode.com/problems/combinations/
// Boxes on Level

class Solution {
    
   
    public void combine(List<List<Integer>> combinations, List<Integer> combination, int currBox, int n, int k)
    {
        
        //Base Case   
        if(currBox == n)
        {
            if(combination.size() == k)
            {
                // We have to use deep copy here 
                // Bcoz we are removing reference after call in backtracking step so we cannot shallow copy it.
                List<Integer> temp = new ArrayList<>(combination);
                combinations.add(temp);
            }
            return;
        }
        
        //options --> current box --> items should be placed or not 
        
        //yes
        combination.add(currBox + 1);
        combine(combinations, combination, currBox + 1, n , k );
        combination.remove(combination.size()- 1);
        
        
        //no
        combine(combinations, combination, currBox + 1, n , k );
        
    }
    public List<List<Integer>> combine(int n, int k) {
        //2d ArrayList initailzed with arraylist all combinations
        List<List<Integer>> combinations = new ArrayList<>();
        //current combination
        List<Integer> combination = new ArrayList<>();
         
        combine(combinations, combination, 0, n, k);
        
        return combinations;
    }
}

// Combinations - 1
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/combinations-i-official/ojquestion
// Box on Level

import java.io.*;
import java.util.*;

public class Main {

  public static void combinations(int cb, int tb, int ssf, int ts, String asf){
    if(cb > tb){
        if(ssf == ts){
            System.out.println(asf);
        }
        return;
    }
    
    // yes    
    combinations(cb + 1, tb, ssf + 1 , ts , asf + "i");
    
    // no
    combinations(cb + 1, tb, ssf, ts, asf + "-");
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    combinations(1, nboxes, 0, ritems, "");
  }

}
