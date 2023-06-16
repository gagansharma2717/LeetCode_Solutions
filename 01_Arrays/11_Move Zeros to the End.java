class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0 ;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != 0 ){ // when current element is non zero place it at count and increase count
              nums[count] = nums[i];
              count++;
            }
        }

        // filling zeros at the end
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
    }
}