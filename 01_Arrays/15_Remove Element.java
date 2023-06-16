class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0 ; i < nums.length; i++){
          if(nums[i] != val){ // we are swapping the elements and skipping val indexes
            nums[k] = nums[i];
            k++;
          }
        }

        return k;
    }
}