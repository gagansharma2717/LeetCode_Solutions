// Items on Level and Items == Boxes
//Swap Method 
class Solution {
    public void swap(int[] nums, int i , int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    List<List<Integer>> res;
    public void permutations(int currBox, int[] nums)
    {
        //Base Case
        if(currBox == nums.length)
        {
            //deep copy
            List<Integer> temp = new ArrayList<>();
            
            for(int i = 0; i < nums.length ; i++)
            {
                temp.add(nums[i]);
            }
            res.add(temp);
            return;
        }
        
        for(int i = currBox; i < nums.length; i++)
        {
            swap(nums,currBox,i);
            permutations(currBox + 1, nums);
            swap(nums,currBox,i);
        }
        
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
         this.res = new ArrayList<>();
        
        permutations(0, nums);
        return res;
    }
}
