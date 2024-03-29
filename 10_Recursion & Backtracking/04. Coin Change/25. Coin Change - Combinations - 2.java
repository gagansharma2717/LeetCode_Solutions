// 25.
// 39. - LeetCode Medium https://leetcode.com/problems/combination-sum/
// Infinite Series

class Solution {
    public void combinations(int currCoin, int target, List<Integer> ansf, List<List<Integer>> res,int[] coins){
        // As we are decreasing value of target with whatever we are adding in answersofar so when 
        // target becomes 0 then simply deep copy the answersofar into result
        if(target == 0){
            res.add(new ArrayList<>(ansf));
            return;
        }
        
        // When currCoin exceeds the uniqueCoins ArrayList
        if(currCoin == coins.length){
            return;
        }
        
         // We are taking value of currentCoin from Coins Array 
         int val = coins[currCoin];
        // In this question we do not need to take care about no. of times, so we simply check for
        // If current coin into its frequency minus target is greater than or equal to 0
        // tb tak loop chalega
        for(int i = 0 ; target - i * val >= 0; i++){
                
                // Adding currentCoin into answersofar till i runs for currCoin
                for(int j = 1 ; j <= i; j++){
                    ansf.add(val);
                }
                
                // yes call for next coin and decrease target with whatever we have added in answersofar
                combinations(currCoin + 1, target - i * val, ansf,res,coins);
                
                // backtracking step
                // Removing currentCoin from answersofar till i runs for currCoin from last
                for(int j = 1 ; j <= i; j++){
                    ansf.remove(ansf.size()-1);
                }
                
            }                 
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> ansf = new ArrayList<>();
         
         combinations(0,target,ansf,res,candidates);
        
        return res;
    }
}