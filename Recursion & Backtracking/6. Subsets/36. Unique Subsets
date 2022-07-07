// 36.
// LeetCode Medium https://leetcode.com/problems/subsets-ii/
// Same as Subsets Just Repetition is allowed
// Item on Level

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void subsets(int currItem, ArrayList<Integer> unique, HashMap<Integer,Integer> fmap, List<Integer> res){
        // When all items are explored
        if(currItem == unique.size()){
            ans.add(new ArrayList<>(res));
            return;
        }
        
        // Taking value of current item
        int val = unique.get(currItem);
        
        // Running loop on the frequency of that value and adding it in result and making next call
        for(int i = 0 ; i < fmap.get(val); i++)
        {
            res.add(val);
            subsets(currItem+1, unique, fmap, res);
        }
        
        // Removing element from result number of times it got added 
        // backtracking step
        for(int i = 0 ; i < fmap.get(val); i++)
        {
            res.remove(res.size()-1);
        }
        
        // no vali call
        subsets(currItem+1, unique, fmap, res);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> unique = new ArrayList<>();
        HashMap<Integer,Integer> fmap = new HashMap<>();
        
        for(int val : nums){
            if(fmap.containsKey(val) == true){
                fmap.put(val,fmap.get(val) + 1);
            }else{
                fmap.put(val,1);
                unique.add(val);
            } 
        }
        
        subsets(0, unique, fmap, new ArrayList<>());
        return ans;
    }
}


// Approach 2
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void subsets(int lastItem, ArrayList<Integer> unique, HashMap<Integer,Integer> fmap, List<Integer> res){
       
       // Adding at each level
        ans.add(new ArrayList<>(res));
        
        // lastitem ke aage hi loop lgaya
        for(int i = lastItem ; i < unique.size(); i++){
            // val and frequency li
            int val = unique.get(i);
            int oldFreq = fmap.get(val);
            
            // it val has frequency greater than 0
            // val ka frequency 1 se decrease kiya and result m val add kiya 
            // next call last item ke aage se
            // then backtracking step
            if(oldFreq > 0){
                
                fmap.put(val, oldFreq - 1);
                res.add(val);
                
                subsets(i, unique, fmap, res);
                
                res.remove(res.size() - 1);
                fmap.put(val,oldFreq);
            }
        }
       
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> unique = new ArrayList<>();
        HashMap<Integer,Integer> fmap = new HashMap<>();
        
        for(int val : nums){
            if(fmap.containsKey(val) == true){
                fmap.put(val,fmap.get(val) + 1);
            }else{
                fmap.put(val,1);
                unique.add(val);
            } 
        }
        
        subsets(0, unique, fmap, new ArrayList<>());
        return ans;
    }
}