class Solution {
    public int firstOccur(int[] nums, int target)
    {
        int left = 0 ;
        int right = nums.length -1;
        int fo = -1; //first occurence
        while(left <= right)
        {
            int mid = left + (right - left ) / 2;
            if(nums[mid] == target)
            {
                fo = mid;
                right = mid - 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return fo;
    }
    
    
    public int lastOccur(int[] nums, int target)
    {
        int left = 0 ;
        int right = nums.length -1;
        int lo = -1; //last occurence
        while(left <= right)
        {
            int mid = left + (right - left ) / 2;
            if(nums[mid] == target)
            {
                lo = mid;
                left = mid + 1;
            }
            else if(nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return lo;
        
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length == 0)
        {
            return ans;
        }
        
        ans[0] = firstOccur(nums,target);
        ans[1] = lastOccur(nums,target);
        
        return ans;
    }
}
//We need to  take two methods because when nums[mid] is equal to target then hme 2 directions m jaana h we can achieve it using 2 methods only. 
