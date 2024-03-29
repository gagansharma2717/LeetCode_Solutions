// 8.
// 46. - LeetCode Medium https://leetcode.com/problems/permutations/
// Method 1
// Boxes on Level

class Solution {
    public void permutations(int currBox, boolean[] itemsPlaced, List<Integer> boxes,int[] nums, List<List<Integer>> res)
    {
        if(currBox == nums.length){
            // shallow copy
            List<Integer> temp = new ArrayList<>(boxes);
            res.add(temp);
            return;
        }
        
        // Traversing Each item
        for(int i = 0 ; i < nums.length; i++){
            // If it is not placed
            if(itemsPlaced[i] == false){
                // Mark item as placed and add it to the box
                itemsPlaced[i] = true;
                boxes.add(nums[i]);
                permutations(currBox+1,itemsPlaced,boxes,nums,res);
                // bactracking step
                // Removing last item from boxes arraylist and marking it as unplaced
                boxes.remove(boxes.size()-1);
                itemsPlaced[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> boxes = new ArrayList<>();
        boolean[] itemsPlaced = new boolean[nums.length];
        
        permutations(0, itemsPlaced, boxes,nums,res);
        return res;
    }
}

// Method 2
// Items on Level 
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
