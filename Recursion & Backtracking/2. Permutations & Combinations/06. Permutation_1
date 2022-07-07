// 6.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutation-i-official/ojquestion
// items on Level

import java.io.*;
public class Main {
    
    // n --> number of boxes
    // k --> number of items 
  public static void permutations(int currentItem, int k , int[] boxes){
      if(currentItem == k){
          for(int val : boxes)
          {
              System.out.print(val);
          }
          System.out.println(); 
      }
      //item --> Which box
      // So traversing each box
      for(int i = 0 ; i < boxes.length; i++){
          // if box is empty
          if(boxes[i] == 0)
          {
              // place the item
              boxes[i] = currentItem+1;
              permutations(currentItem+1, k, boxes);
              // backtracking
              boxes[i] = 0;
          }
      }
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    int[] boxes = new int[n];
    permutations(0,k,boxes);
  }

}