// 5.
// Pepcoding https://www.Pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/permutations-ii-official/ojquestion
//Boxes on Level

import java.io.*;
public class Main  {

    // n --> no of items
    // k --> no of boxes
  public static void permutations(int currBox, int n, int k, boolean[] itemPlaced, String boxes, int itemPlacedCount){
    
    
    if(currBox == n)
    {
        if(itemPlacedCount == k)
        {
            System.out.println(boxes);
        }
        
        return;
    }
    // Traversing till k
    for(int i = 0 ; i < k ; i++)
    {
        // If item is unplaced
        if(itemPlaced[i] == false)
        {
          // place the item 
          itemPlaced[i] = true;
          permutations(currBox + 1, n, k, itemPlaced, boxes + (i + 1), itemPlacedCount + 1);
          //backtracking step
          itemPlaced[i] = false;
        }
    }
    
    // currentBox -> Do not place any item
    permutations(currBox + 1, n, k, itemPlaced, boxes + 0, itemPlacedCount);
    
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());
    
    String boxes = "";
    boolean[] itemPlaced = new boolean[k];
    permutations(0, n, k, itemPlaced, boxes, 0 );
  }

}
