// 1326. Minimum Number of Taps to Open to Water a Garden
// https://leetcode.com/problems/minimum-number-of-taps-to-open-to-water-a-garden/
// Needs to Dry Run -- hard

class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] jumps = new int[n+1];
        
        // Calculate Jumps or area tap can cover        
        for(int i = 0 ; i < n+1; i++){
            int l = Math.max(0, i-ranges[i]);
            int r = Math.min(n, i+ranges[i]);
            
            jumps[l] = Math.max(jumps[l], r-l);
        }
        
        
        // Greedy
        int currEnd = 0;
        int maxReach = 0;
        int count = 0;
        
        for(int i=0 ; i<n ;i++){
            maxReach = Math.max(maxReach, jumps[i] + i);
            
            if(i == currEnd){
                count++;
                currEnd = maxReach;
            }
        }
        
        if(currEnd >= n) return count;
        
        return -1;
    }
}