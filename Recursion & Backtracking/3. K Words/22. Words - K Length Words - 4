// 22.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-klength-words-4-official/ojquestion
// Permutations
// Repetition allowed
// Item on Level

import java.io.*;
import java.util.*;

public class Main {

   public static void generateSolution(int cs, int ts, String ustr, HashMap<Character, Integer> fmap, String ans){

    if(cs > ts) {
        System.out.println(ans);
        return;
    }

    for(int i = 0 ; i < ustr.length(); i++){
        int val = fmap.get(ustr.charAt(i));
        if(val > 0){
            fmap.put(ustr.charAt(i), val - 1);
            generateSolution(cs + 1, ts, ustr ,fmap, ans + ustr.charAt(i));
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
     generateSolution(1,k,ustr,unique,"");
  }

}