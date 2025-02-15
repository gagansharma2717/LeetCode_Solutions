//Medium
//Merge Sort
class Solution {
    
    public void mergeSort(int[] arr, int low , int high)
    {
        if(low >= high)
        {
            return;
        }
        
        
        int mid = low + (high - low) / 2; // Safe from Overflow
        
        mergeSort(arr,low, mid);
        mergeSort(arr,mid+1,high);
        
        mergeTwoSortedArray(arr,low,mid,mid+1,high);
        
    }
    public void mergeTwoSortedArray(int[] nums, int a1l, int a1r, int a2l, int a2r )
    {
        int totalRes = (a1r - a1l + 1) + (a2r - a2l + 1);
        int[] res = new int[totalRes];
        
        
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if(nums[ptr1] <= nums[ptr2]){
                res[ptr3] = nums[ptr1];
                ptr3++; ptr1++;
            } 
            else {
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
        
    }
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length-1);  
        
        return nums;
    }
}
