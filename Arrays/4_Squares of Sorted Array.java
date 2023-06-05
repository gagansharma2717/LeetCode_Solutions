// Bruteforece - O(nlogn) - traverse array and calc squares O(n)
// then sort O(nlogn) - O(n) + O(nlogn) = O(nlogn)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int[nums.length];
        int i = 0 , j = nums.length-1;
        int k = res.length-1;
        while(i <= j){
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];           
            if(val1 > val2){
                res[k] = val1;
                i++;
            }else{
                res[k] = val2;
                j--;
            }
            k--;
        }
        return res;
    }
}
//O(n)