public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: An integer
     */
    public int twoSum6(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);

        int left = 0 , right = nums.length-1;

        int count = 0 ; 

        while(left < right)
        {
            if(left > 0 && nums[left] == nums[left - 1])
            {
                left++; continue;
            }
            int sum = nums[left] + nums[right];
            if(sum == target)
            {
                count++;
                left++;
                right--;
            }   
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return count;
    }
}