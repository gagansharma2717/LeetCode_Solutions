class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n ; 
        if(k < 0 ){
          k = k + n;
        }
    

    reverse(nums, 0, n-k-1);
    reverse(nums, n-k, n-1);
    reverse(nums, 0, n-1);
    }

    public void reverse(int[] arr, int left, int right){
      while(left < right){
        swap(arr,left,right);
        left++;
        right--;
      }
    }

    public void swap(int[] arr, int left, int right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }
}

// last se rotate or right se rotate