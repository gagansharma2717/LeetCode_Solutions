//Items on Level
import java.io.*;
import java.util.*;

public class Main {
    
    // ci --> current item
    // ti --> total item
  public static void combinations(int[] boxes, int ci, int ti, int lastIdx){
   // when current item is equal to total item
    if(ci == ti)
    {
        //array pr loop and print values of array
        for(int val : boxes)
        {
            if(val == 0) System.out.print("-");
            else System.out.print("i");
        }
        System.out.println();
        return;
    }
    
    for(int i = lastIdx+1 ; i < boxes.length; i++)
    {
        // if boxes is empty
        if(boxes[i] == 0)
        {
            // Added current item + 1
            boxes[i] = ci + 1;
            //call lgayi
            combinations(boxes,ci  + 1, ti , i );
            // backtrack
            boxes[i] = 0;
        }
    }
    
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    combinations(new int[n], 0, k, -1);
  }

}
