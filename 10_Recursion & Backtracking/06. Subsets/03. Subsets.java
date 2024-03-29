// 3.
// 78 - LeetCode Medium https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums, int idx) {
        
        if(idx == nums.length)
        {
            List<List<Integer>> bres = new ArrayList<>();
            bres.add(new ArrayList<>());
            return bres;
        }
        
        List<List<Integer>> tres = subsets(nums,idx+1);
        List<List<Integer>> res = new ArrayList<>();
        
        for(List<Integer> subSet : tres)
        {
            // newSubset --> Yes choice
            List<Integer> newSubset = new ArrayList<>();
            newSubset.add(nums[idx]);
            for(Integer i : subSet)
            {
                newSubset.add(i);
            }
            res.add(newSubset);
            
            //subSet --> no choice
            res.add(subSet);
        }
            
        return res;
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        //Idx 0 pass kiya and function call kiya
       int idx = 0;
       return subsets(nums,idx);
        
    }
   
}

//TC -> O(2^N)
