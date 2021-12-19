import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
}


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    public static long mergeSort(long[] arr, int low , int high)
    {
        if(low >= high)
        {
            return 0;
        }
        
        
        int mid = low + (high - low) / 2;
        
        long leftcount = mergeSort(arr,low, mid);
        long rightcount = mergeSort(arr,mid+1,high);
        
        long count = mergeTwoSortedArray(arr,low,mid,mid+1,high);
        
        return leftcount + rightcount + count;
    }
    
    public static long mergeTwoSortedArray(long[] nums, int a1l, int a1r, int a2l, int a2r )
    {
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        long[] res = new long[totalRes];
        
        long inversion_count = 0;
        
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
                //Simply added this for inversion sort
                inversion_count += (a1r - ptr1 + 1L);
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
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        return mergeSort(arr, 0,(int) N - 1);
         
         
    }
}
