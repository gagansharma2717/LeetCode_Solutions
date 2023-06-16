// 42. Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        // Left ka first element
        left[0] = height[0];
        
        for(int i = 1 ; i < n ; i++){
            // Compare left ka pichla max and current element
            left[i] = Math.max(left[i-1], height[i]);
        }
        
        // right ka last element
        right[n-1] = height[n-1];
        
        // reverse loop and compare right ka last max and current element
        for(int i = n - 2; i >= 0 ; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }
        
        int ans = 0;
        // Compare left and right ka min minus our current element height 
        // will be our answer
        for(int i = 0 ; i < n ; i++){
            ans += (Math.min(left[i], right[i])- height[i]);
        }
        
        return ans;
    }
}



// With Space optimization
class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        
        int lmax = 0;
        int rmax = 0;
        int ans = 0 ;
        
        while(l < r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            
            if(lmax < rmax){
                ans += lmax - height[l];
                l++;
            }else{
                ans += rmax - height[r];
                r--;
            }
        }
        return ans;
    }
}