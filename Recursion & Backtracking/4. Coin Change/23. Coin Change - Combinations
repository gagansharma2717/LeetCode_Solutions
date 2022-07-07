// 23.
// 40. - LeetCode Medium https://leetcode.com/problems/combination-sum-ii/
// Finite Series

class Solution {
    public void combinations(int target, List<Integer> ansf, List<List<Integer>> res, HashMap<Integer,Integer> fmap, ArrayList<Integer> uniqueCoins, int currCoin){
        // As we are decreasing value of target with whatever we are adding in answersofar so when 
        // target becomes 0 then simply deep copy the answersofar into result
        if(target == 0){
            res.add(new ArrayList<>(ansf));
            return;
        }
        
        // When currCoin exceeds the uniqueCoins ArrayList
        if(currCoin == uniqueCoins.size()){
            return;
        }
        
        // We are taking value of currentCoin from uniqueCoins ArrayList 
        int val = uniqueCoins.get(currCoin);
        // Running loop till currentCoin Frequency because in this question we need to take care of how many
        // time currentcoint got added in ansf so we created a hashmap and storing coins frequency
        for(int i = 0 ; i <= fmap.get(val); i++){
            // If current coin into its frequency minus target is greater than or equal to 0
            // tbhi next call lgao
            if(target - i * val >= 0){
    
                // Adding currentCoin into answersofar till its frequency
                for(int j = 1 ; j <= i; j++){
                    ansf.add(val);
                }
                
                // yes call for next coin and decrease target with whatever we have added in answersofar
                combinations(target - i * val, ansf,res,fmap,uniqueCoins, currCoin + 1);
                
                // backtracking step
                // Removing currentCoin from answersofar till its frequency from last 
                for(int j = 1 ; j <= i; j++){
                    ansf.remove(ansf.size()-1);
                }
                
            }                 
        }
        
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ansf = new ArrayList<>();
        HashMap<Integer, Integer> fmap = new HashMap<>();
        ArrayList<Integer> uniqueCoins = new ArrayList<>();
        
        for(int val : candidates) {
            if(fmap.containsKey(val) == false){
                fmap.put(val, 1);
                uniqueCoins.add(val);
            }else{
                fmap.put(val, fmap.get(val)+ 1);
            }
        }
        
        combinations(target,ansf,res,fmap,uniqueCoins, 0);
        
        return res;
    }
}