// Non - Unique Elements or Duplicate elements
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return true;

            // Trimming the search space for array like this
            // nums = {3,1,2,3,3,3,3} , target = 2
            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                low++;
                high--;
                continue;
            }
            // left sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            else // right sorted
            {
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}