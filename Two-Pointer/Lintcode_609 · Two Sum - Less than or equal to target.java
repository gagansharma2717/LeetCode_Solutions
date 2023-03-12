public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        Arrays.sort(nums);

        int left = 0 , right = nums.length-1;

        int ans = 0 ; 

        while(left < right)
        {
            int sum = nums[left] + nums[right];

            if(sum <= target)
            {
                ans += right - left ;
                left++;
            }   
            else
            {
                right--;
            }
        }
        return ans;
    }
}