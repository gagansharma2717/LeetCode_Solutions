class Solution {
    public int removeDuplicates(int[] nums) {
        // Two pointers left and both at index 1 bcoz 0th element cannot be duplicate
        // left is only for non-duplicate element
        int left = 1 ; 
        for(int i = 1 ; i < nums.length ; i++){
            // if element at ith index is not same as previous element then its new element 
            // so put it at nums[left] and increment left 
            if(nums[i] != nums[i-1]){
              nums[left] = nums[i];
              left++;
            }
        }

        return left;
    }
}