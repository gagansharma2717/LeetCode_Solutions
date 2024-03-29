// 9.
// 47. - LeetCode Medium https://leetcode.com/problems/permutations-ii/
// Distinct Permutations
// Box on Level

class Solution {
    public void permutations(int currBox ,int[] nums, List<Integer> ans, List<List<Integer>> res,HashMap<Integer,Integer> freq){
        // Base case
        if(currBox == nums.length){
            List<Integer> temp = new ArrayList<>(ans);
            res.add(temp);
        }
        
        // Loop on Frequency Hashmap
        for(Integer key : freq.keySet()){
            
            // Get the value
            int val = freq.get(key); 
            if( val > 0){
                // Decrease frequency and put in hashmap and add key in ans 
                freq.put(key, val - 1);
                ans.add(key);
                
                // yes call
                permutations(currBox+1,nums,ans,res,freq);
                
                // backtracking step 
                // removing last element from and and updating frequency hashmap with older value 
                // phle val thi then val-1 krke put kiya then val hi original value hogi na instead of val+1 --> Main point
                ans.remove(ans.size()-1);
                freq.put(key,val);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        // Created frequency hashmap and filled it with values 
        HashMap<Integer,Integer> freq = new HashMap<>();
        // Legacy way to create frequency hashmap
        // for(int i = 0 ; i < nums.length; i++)
        // {
        //     if(freq.containsKey(nums[i])){
        //         int val = freq.get(nums[i]);
        //         freq.put(nums[i], val+1);
        //     }else{
        //         freq.put(nums[i], 1);
        //     }
        // }

        // using method
         for(int i = 0 ; i < nums.length; i++)
         {
             freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
         }
        
        permutations(0,nums,new ArrayList<>(), res, freq);
        return res;
    }
}

//Approach 2
// Items on Level

class Solution {

    public void permutations(int currItem, int[] nums,HashMap<Integer,Integer> lastIdx,List<Integer> ans, List<List<Integer>> res){
        if(currItem == nums.length){
            List<Integer> copy = new ArrayList<>(ans);
            res.add(copy);
            return;
        }
        
        // st --> Starting Point //particular char ka last index jha pr vo place hua
        int st = lastIdx.get(nums[currItem]);
        
        // st ke baad se loop lgaya
        for(int i = st + 1 ; i < ans.size(); i++)
        {
            // agar box empty hai toh
            if(ans.get(i) == null)
            {
                // uss box pr item place kiya and last index update kiya hashmap m
                ans.set(i,nums[currItem]);
                lastIdx.put(nums[currItem], i);
            
                // yes call
                permutations(currItem+1, nums,lastIdx, ans, res);

                // last index phirse st kr diya and box empty kiya
                lastIdx.put(nums[currItem], st);
                ans.set(i,null);
            }
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            ans.add(null);
        }
        
        HashMap<Integer,Integer> lastIdx = new HashMap<>();
        
        for(int i = 0 ; i < nums.length; i++){
            lastIdx.put(nums[i],-1);
        }
        
        permutations(0,nums,lastIdx,ans, res);
        return res;
    }
}