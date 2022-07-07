// 39.
// PepCoding https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/recursion-and-backtracking/gold-mine-2-official/ojquestion


import java.io.*;
import java.util.*;

public class Main {
    public static void travelAndCollectGold(int[][] arr, int sr , int sc, boolean[][] vis, ArrayList<Integer> bag){
        // Negative Base Case Out of Bound and Checking for 0 and visited cell 
        if(sr < 0 || sc < 0 || sr >= arr.length || sc >= arr[0].length || arr[sr][sc] == 0 || vis[sr][sc] == true){
            return;
        }
        
        // mark it as visited and add the cell value of gold in bag and make calls in 4 directions 
        vis[sr][sc] = true;
        bag.add(arr[sr][sc]);
        //TRLD
        travelAndCollectGold(arr,sr-1,sc,vis,bag);
        travelAndCollectGold(arr,sr,sc+1,vis,bag);
        travelAndCollectGold(arr,sr,sc-1,vis,bag);
        travelAndCollectGold(arr,sr+1,sc,vis,bag);
      
    }
    
	static int max = 0;
	public static void getMaxGold(int[][] arr){
		
		boolean[][] vis = new boolean[arr.length][arr[0].length];
		
        // loop on every index and if it is not 0 and not visited make a new call 
        // and collect the gold and compare it with previously collected gold 
        // whatever is maximum update it in max
		for(int i = 0 ; i < arr.length; i++){
		    for(int j = 0 ; j<arr[0].length; j++){
		        if(arr[i][j] != 0 && vis[i][j] == false){
		           
                   ArrayList<Integer> bag = new ArrayList<>();
		           travelAndCollectGold (arr, i , j , vis, bag);
		           
		           int sum = 0 ;
		           for(int val : bag){
		               sum += val;
		           }
		           
		           if(sum > max){
		               max = sum;
		           }
		        }
		    }
		}

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
	}
		
}