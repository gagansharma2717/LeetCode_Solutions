class Solution {
    public int search(int[] nums, int target) {
        int low = 0 ; int high = nums.length-1;
        
        while(low <= high)
        {
            //int mid = (low + high) / 2;
            int mid = low + (high - low) / 2; //to save from overflow 
            
            if(nums[mid] == target)
            {
                return mid; //search is successful
                
            }else if(nums[mid] < target)//target is greater than mid
            {
                low = mid + 1;
                
            }else
            {
                high = mid - 1; //target is smaller than mid
            }
        }
        
        return -1; //element not found
    }
}
