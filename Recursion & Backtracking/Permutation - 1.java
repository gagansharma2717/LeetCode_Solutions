//Items on Level
import java.io.*;
import java.util.*;

public class Main {
    
    // ci --> current item
    // ti --> total item
  public static void permutations(int[] boxes, int ci, int ti){
   // when current item is equal to total item
    if(ci == ti)
    {
        //array pr loop and print values of array
        for(int val : boxes)System.out.print(val);
        System.out.println();
        return;
    }
    
    for(int i = 0 ; i < boxes.length; i++)
    {
        // if boxes is empty
        if(boxes[i] == 0)
        {
            // Added current item + 1
            boxes[i] = ci + 1;
            //call lgayi
            permutations(boxes,ci  + 1, ti);
            // backtrack
            boxes[i] = 0;
        }
    }
    
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    permutations(new int[n], 0, k);
  }

}
