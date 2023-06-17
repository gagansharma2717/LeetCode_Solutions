public class Solution {
    
    public void wiggleSort(int[] nums) {
        // next element se compare kr rhe hai toh nums.length-1 se less than else out of bound aayega
        for(int i = 0 ; i < nums.length-1; i++){
            if(i % 2 == 0){
                // for even indexes for 0,2,4 & so on agar m next element se bda hu toh swap
                if(nums[i] > nums[i+1]){
                    swap(nums,i,i+1);
                }
            }else{
                // odd index ke case m agar next mujhse bda hai toh swap
                if(nums[i] < nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
        }
    }

    public void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}