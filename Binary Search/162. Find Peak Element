class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0 , high = nums.length-1;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2 ;
            
            long lval = (mid - 1 >= 0) ? nums[mid - 1] : Long.MIN_VALUE;
            long rval = (mid + 1 < nums.length) ? nums[mid + 1] : Long.MIN_VALUE;
            
            if((long) nums[mid] > lval && (long) nums[mid] > rval)
            {
                return mid;
            }
            else if(lval < nums[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
                
            }
        }
        
        return -1;
    }
}
