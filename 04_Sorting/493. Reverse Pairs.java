//HARD
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
        
        int inversion_count = findIversionCount(nums,a1l,a1r,a2l,a2r);
        
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
        
        
        return inversion_count;
    }
    
    public int findIversionCount(int[] nums, int a1l, int a1r, int a2l, int a2r)
    {
        int inv_count = 0;
        int ptr1 = a1l, ptr2 = a2l, ptr3 = 0;
        while(ptr1 <= a1r && ptr2 <= a2r){   
            if((long)nums[ptr1] <= 2l * (long)nums[ptr2]){
               ptr3++; ptr1++;
            } 
            else {
                inv_count += (a1r - ptr1 + 1);
                ptr3++; ptr2++;
            }
        }
        
        return inv_count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
}


