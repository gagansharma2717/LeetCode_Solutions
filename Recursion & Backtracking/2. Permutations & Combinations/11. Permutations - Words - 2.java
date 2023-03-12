// 11.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutations-words-2-official/ojquestion
// Distinct Permutations
// Items on Level

import java.io.*;
import java.util.*;

public class Main {

  public static void generateWords(int currItem, String str, Character[] spots, HashMap<Character, Integer> lastIdx) {
    // Base Case
   if(currItem == str.length()){
       for(Character c : spots){
           System.out.print(c);
       }
       System.out.println();
       return;
   }
   

   // Particular Character ke last index ke aage se loop lgya
   int st = lastIdx.get(str.charAt(currItem));
   for(int i = st + 1 ; i < str.length(); i++)
    {
        // If spot is null or empty
        if(spots[i] == null){
            // Character place kiya spot pr and hashmap update kiya with its last occurrence
            Character c = str.charAt(currItem);
            spots[i] = c;
            lastIdx.put(c, i);
            
            // yes  call
            generateWords(currItem+1, str, spots, lastIdx);
            // backtracking step hashmap mai previous state of last occurrence update kiya and spot null kiya
            lastIdx.put(c, st);
            spots[i] = null;
        }
    }
   
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Character[] spots = new Character[str.length()];
    HashMap<Character, Integer> lastOccurence = new HashMap<>();
    for(char ch: str.toCharArray()){
      lastOccurence.put(ch, -1);
    }

    generateWords(0, str, spots, lastOccurence);
  }

}

