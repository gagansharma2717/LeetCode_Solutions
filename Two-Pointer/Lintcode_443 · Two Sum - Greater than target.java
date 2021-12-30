public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: an integer
     */
    public int twoSum2(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);

        int left = 0 , right = nums.length-1;

        int ans = 0 ; 

        while(left < right)
        {
            int sum = nums[left] + nums[right];

            if(sum <= target)
            {
                left++;
            }   
            else
            {
                ans += right - left ;
                right--;
            }
        }
        return ans;
    }
}