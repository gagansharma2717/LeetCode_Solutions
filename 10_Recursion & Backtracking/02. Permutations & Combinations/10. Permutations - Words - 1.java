// 10 .
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutations-words-1-official/ojquestion
// Distinct Permutations
// Box on Level

import java.io.*;
import java.util.*;

public class Main {

  public static void generateWords(int currBox, int totalBox, HashMap<Character, Integer> fmap, String asf) {
    
    if(currBox == totalBox){
        System.out.println(asf);
        return;
    }

    // Boxes and Items are Equal so there is only one call with yes
    // Loop on all unique characters in hashmap
    for(Character key : fmap.keySet()){

        // get the frequency of character from hashmap
        int val = fmap.get(key);
        // if it is greater than 0
        if(val > 0){
            // decrease frequency by 1
            fmap.put(key, val-1);
            // make the call
            generateWords(currBox + 1 , totalBox, fmap, asf + key);
            // backtracking step make frequcy to its older value
            fmap.put(key, val);
        }
    }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    HashMap<Character, Integer> fmap = new HashMap<>();
    for(char ch: str.toCharArray()){
      if(fmap.containsKey(ch)){
        fmap.put(ch, fmap.get(ch) + 1);
      } else {
        fmap.put(ch, 1);
      }
    }

    
    generateWords(0, str.length(), fmap, "");
  }

}


