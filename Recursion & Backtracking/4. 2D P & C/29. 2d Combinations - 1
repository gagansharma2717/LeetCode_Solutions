// 29.
// Pepcoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/queens-combinations-2das2d-box-chooses-official/ojquestion
// Box on Level

import java.io.*;
import java.util.*;

public class Main {

  //queens placed so far --> qpsf
  // tq --> total queens
  public static void queensCombinations(int qpsf, int tq, int row, int col, String asf) {
    // Positive Base Case
    //Jab row total queens k equal ho jaye
    if (row == tq)
    {
      //queens placed so far == total queens
      if (qpsf == tq)
      {
        System.out.println(asf);
      }

      return;
    }
    
    // Negative Base Case
    //Pruning Step
    if (qpsf > tq)
    {
      return;
    }

    // If all the columns of current row are visited then increase the row.
    if (col == tq  - 1)
    {
      

      //yes
      // For Next Row we have added column as 0 and increased the row
      queensCombinations(qpsf + 1, tq, row + 1, 0, asf + "q"  + "\n");

      //no
      queensCombinations(qpsf, tq, row + 1, 0, asf + "-"  + "\n");
    }
    else // Simply increase the columns and make two calls i.e, placed or not placed
    {

      //yes
      queensCombinations(qpsf + 1, tq, row, col + 1, asf + "q");

      //no
      queensCombinations(qpsf, tq, row, col + 1, asf + "-");
    }

  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    queensCombinations(0, n, 0, 0, "");
  }
}

