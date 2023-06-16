class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 2;
        for(int i = 2 ; i < nums.length; i++){
            if(nums[i] != nums[left-2]){
              nums[left] = nums[i];
              left++;
            }
        }
        return left;
    }
}