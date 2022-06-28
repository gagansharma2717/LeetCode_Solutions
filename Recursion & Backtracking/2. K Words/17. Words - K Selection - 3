// 17.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/words-kselection-3-official/ojquestion
// Repetition allowed
// unique items on level

import java.io.*;
import java.util.*;

public class Main {

  public static void combinations(int currCh, String ustr, HashMap<Character, Integer> fmap, String ans, int k){
      
      // Positive Base Case
      // When our answer length is equal to given k 
      if(ans.length() == k){
          System.out.println(ans);
          return;
      }
      
      //Negative Base Case
      // When Current Character call becomes equal to Unique String length  
      if(currCh == ustr.length()){
          return;
      }
      
      int val = fmap.get(ustr.charAt(currCh));
      
      // Reversed loop to get the exact output
      for(int  i = val ; i >= 0 ; i--){
          
          // E.g. when k is 2 and we are making call to a3 then continue
          // Continue because of reverse loop else it would be return
          // if we run straight loop
          // Here we are checking if frequency of character that we are trying to add in answer and existing answer length should
          // not exceed given k
          if(i + ans.length() > k){
              continue;
          }
          
          String newAns = ans;
          // Here we are adding the character repeatedly in new string that we pass as new answer for next call.
          for(int j = 1 ; j <= i; j++){
              newAns += ustr.charAt(currCh);
          }
          
          combinations(currCh+1,ustr,fmap,newAns,k);
        }
      
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashMap<Character, Integer> fmap = new HashMap<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (fmap.containsKey(ch) == false) {
        fmap.put(ch, 1);
        ustr += ch;
      } else {
        fmap.put(ch, fmap.get(ch) + 1);
      }
    }

    combinations(0,ustr,fmap,"",k);
  }

}