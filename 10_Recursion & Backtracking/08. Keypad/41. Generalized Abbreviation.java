// 41. 
// LeetCode Medium https://leetcode.com/problems/generalized-abbreviation/

class Solution  {
    
    List<String> res;
    
    public void generateAbb(String input, int idx, String output, int count)
    {
        if(idx == input.length()){
            if(count > 0) res.add(output + count);
            else res.add(output);
            return;
        }
        
        // yes call
        // if count of no vale chracters before current character call is 0 then we will add current character in output
        // if count of no vale chracters before current character call is greater than 0 then we will add count of previous no vale characters plus current character in output
        char ch = input.charAt(idx);
        generateAbb(input, idx+1, output + ((count == 0) ? "" : count) + ch, 0); //yes
        
       
        // In no vali call we simply increase the index and count of no vale characters 
         generateAbb(input, idx+1, output, count+1); //no
    }
    public List<String> generateAbbreviations(String word) {
        res = new ArrayList<>();
        generateAbb(word, 0, "", 0);
        return res;
    }
}



//PepCoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/abbreviation-suing-backtracking-official/ojquestion  

import java.io.*;
import java.util.*;

public class Main {

    public static void solution(String input, int idx, String output,int count){
        if(idx == input.length()){
            if(count > 0) System.out.println(output+count);
            else System.out.println(output);
            return;
        }
        
        char ch = input.charAt(idx);
        solution(input, idx + 1, output + ((count == 0) ? "" : count) + ch, 0);
        
        solution(input, idx + 1, output, count + 1);
        
    }
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        solution(input,0,"",0);
    }
    
    
}