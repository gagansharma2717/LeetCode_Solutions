// 16.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/word-kselection-2-official/ojquestion
// Repetition not allowed
// unique items on level

import java.io.*;
import java.util.*;

public class Main {
    
  public static void  combination(int lastIdx, ArrayList<Character> chs, String res, int k ){
        // When result is equal to k then print result else ignore
        if(res.length() == k){
          System.out.println(res);
        }
        
      // Running loop on all unique characters and adding it to result
      for(int i = lastIdx + 1; i < chs.size(); i++){
          
          combination(i, chs, res + chs.get(i), k);
      }
  }

  public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      String str = scn.next();
      int k = scn.nextInt();
      
      // Hashset to store unique character 
      // Storing unique character in arraylist from hashset
      HashSet<Character> hset = new HashSet<>();
      ArrayList<Character> chs = new ArrayList<>();
      for(int i = 0; i < str.length(); i++)
      {
          Character c = str.charAt(i);
          // if character is not present in hashset then add it in 
          // arraylist and then in hashset
          if(hset.contains(c) == false){
              hset.add(c);            
              chs.add(c);
          }
      }
      
      combination(-1, chs,"", k);

  }
}