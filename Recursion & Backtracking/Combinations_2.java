// 4. 
//Items on Level
import java.io.*;
import java.util.*;

public class Combinations_2 {

  public static void combinations(int currentItem, int k,int[] boxes, int lastIdx){
      // when all items are placed
      if(currentItem == k)
      {
        for(int val : boxes){
            if(val == 0){
                System.out.print("-");
            }else{
                System.out.print("i");
            }
        }
        System.out.println();
      }
    
      // traversing each box with lastidx se aage hi
      for(int i = lastIdx + 1 ; i  < boxes.length; i++)
      {
          // if item is not placed
          if(boxes[i] == 0)
          {
              // place the item
              boxes[i] = currentItem + 1;
              combinations(currentItem+1,k,boxes,i);
              // backtracking
              boxes[i] = 0 ;
            }
      }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    int[] boxes = new int[n];
    combinations(0,k,boxes,-1);
  }

}

// Items on Level is mainly for permutation-1 but hmne last index se aage hi calls lagi to achieve combination.