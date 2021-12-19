// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countSwaps(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public int mergeSort(int[] arr, int low , int high)
    {
        if(low >= high)
        {
            return 0;
        }
        
        
        int mid = low + (high - low) / 2;
        
        int leftcount = mergeSort(arr,low, mid);
        int rightcount = mergeSort(arr,mid+1,high);
        
        int count = mergeTwoSortedArray(arr,low,mid,mid+1,high);
        
        return leftcount + rightcount + count;
    }
    
    public int mergeTwoSortedArray(int[] nums, int a1l, int a1r, int a2l, int a2r )
    {
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        int[] res = new int[totalRes];
        
        int inversion_count = 0;
        
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
                inversion_count += (a1r - ptr1 + 1);
                res[ptr3] = nums[ptr2];
                ptr3++; ptr2++;
            }
        }
        
        while(ptr1 <= a1r){
           res[ptr3] = nums[ptr1];
           ptr3++; ptr1++; 
        }
        
        while(ptr2 <= a2r){
           res[ptr3] = nums[ptr2];
           ptr3++; ptr2++;  
        }
        
        for(int i=a1l; i<=a2r; i++){
            nums[i] = res[i - a1l];
        }
        
        
        return inversion_count;
    }
    int countSwaps(int arr[], int n) {
         return mergeSort(arr, 0,n - 1);
    }
}
