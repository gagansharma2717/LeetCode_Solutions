// sort 0-1-2
class Solution {
    public void sortColors(int[] nums) {
        int i = 0 , j = 0 ;
        int k = nums.length-1;

        while(i <= k){
          if(nums[i] == 0){
            swap(nums,i,j);
            i++; j++;
          }else if(nums[i] == 1){
            i++;
          }else{ // nums[j] == 2
            swap(nums,i,k);
            k--;
          }
        }
    }

    public void swap(int arr[], int first, int second){
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
    }
}