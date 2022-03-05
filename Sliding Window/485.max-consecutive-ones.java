/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0 ;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                continue;
            }
            
            int count = 0 ;
            while(i < nums.length && nums[i] == 1)
            {
                count++;
                i++;
            }
            
            max = Math.max(max,count); 
        }
        
        return max;
        
    }
}
// @lc code=end

