/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {

        int countZeros = 0;
        int maxSum = 0;

        int left = 0;
        
        for(int right = 0 ; right < nums.length; right++)
        {
            

            if (nums[right] == 0) {
                countZeros++;
            }

            //make subarray valid by excluding left elements
            while(countZeros > k)
            {
                if (nums[left] == 0)
                    countZeros--;
                left++;
            }

            int sum = right - left + 1;
            maxSum = Math.max(maxSum, sum );
        }
        
        return maxSum;
        
    }
}
// @lc code=end

