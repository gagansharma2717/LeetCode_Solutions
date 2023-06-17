class Solution {
    public int nextGreaterElement(int n) {
      char arr[] = (Integer.toString(n)).toCharArray();
      
      int i = arr.length-2;

      // traversing from right and finding smaller element 
      while(i >= 0 && arr[i] >= arr[i+1]){
         i--;
      }

      if(i == -1){
        return -1;
        // NGE not possible
      }

      //find just greater than ith index element
      int j = arr.length-1;
      while(arr[i] >= arr[j]){
         j--;
      }

      // swap ith and jth element
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      String res = "";

      // Adding 0 to ith index element in result
      for(int k = 0 ; k <= i ; k++){
         res += arr[k];
      }

      // Adding elements from last till ith element to reverse
      for(int k = arr.length-1 ; k > i ; k--){
        res += arr[k];
      }

      // ans can be greater than integer
      long ans = Long.parseLong(res);

      //if greater than intger than return -1 else return ans
      return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
    }
}