// 20.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-klength-words-2-official/ojquestion
// Permutations
// Repetition not allowed
// Item on Level
import java.io.*;
import java.util.*;

public class Main {

  public static void permutations(String ustr, HashSet<Character> unique, int k, String ans){
      if(ans.length() == k){
          System.out.println(ans);
          return;
      }

      // Loop on each character from ustr
      for(Character ch : ustr.toCharArray()){
          // if hashset contains that character then remove it from hashset and add that charcter to answer and make a next call
          // while coming back i.e., In backtracking step again add that character into hashset
          if(unique.contains(ch) == true) {
              unique.remove(ch);
              permutations(ustr,unique,k,ans+ch);
              unique.add(ch);
          }
      }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }

     permutations(ustr,unique,k,"");
  }
}