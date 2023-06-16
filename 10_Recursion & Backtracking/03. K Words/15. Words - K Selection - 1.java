// 15.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-1-official/ojquestion
// Repetition not allowed
// Simple Combination just for unique character used hashset then stored it in another string

import java.io.*;
import java.util.*;

public class Main {

    public static void combination(int i, String ustr, int ssf, int ts, String asf ) {

        // When i is equal to total unique characters
        if(i == ustr.length()){
            // and string so far count is equal to given k
            // just print the answer
            if(ssf == ts)
            {
                System.out.println(asf);
            }

            return;
        }

        // yes
        combination(i+1, ustr, ssf + 1, ts, asf + ustr.charAt(i));

        // no
        combination(i+1, ustr, ssf, ts, asf + "");

        // call for no is there because we have more boxes
        // items needs to place are less.

  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    int k = scn.nextInt();

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }

    combination(0, ustr, 0, k, "");
  }

}
