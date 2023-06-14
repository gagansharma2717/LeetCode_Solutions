class Solution
{
    static void rotateArr(int[] nums, int k, int n)
    {
        k = k % n ; 
    

        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }

    static void reverse(int[] arr, int left, int right){
      while(left < right){
        swap(arr,left,right);
        left++;
        right--;
      }
    }

    static void swap(int[] arr, int left, int right){
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
    }

}

// left se rotate or start se rotate