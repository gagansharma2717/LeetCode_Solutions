// 18.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-4-official/ojquestion
// Repetition allowed

import java.io.*;
import java.util.*;

public class Main {

  public static void generateSolution(int cs, int ts, int lc,String ustr, HashMap<Character, Integer> fmap, String ans){
    // if current call is greater than given k
    // Positive base case
    if(cs > ts) {
        System.out.println(ans);
        return;
    } 
    
    // if last character is equal to unique character length
    // negative base case
    if(lc == ustr.length()){
        return;
    }
    
    // loop from last character to end of unique character string
    for(int i = lc ; i < ustr.length(); i++){
        
        // taking frequency from hashmap 
        int val = fmap.get(ustr.charAt(i));
        if(val > 0){

            // updating frequency by 1
            fmap.put(ustr.charAt(i), val - 1);

            // call
            generateSolution(cs + 1, ts , i , ustr ,fmap, ans + ustr.charAt(i));

            // backtracking
            fmap.put(ustr.charAt(i), val);
        }
        
    }
  }  

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> unique = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.containsKey(ch) == false) {
        unique.put(ch, 1);
        ustr += ch;
      } else {
        unique.put(ch, unique.get(ch) + 1);
      }
    }

     generateSolution(1,k,0,ustr,unique,"");
  }

}