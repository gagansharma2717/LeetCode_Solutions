// It is kind of calculating Area of rectangle l * b
// i = st_idx and j = end_idx
// length will be min(ht[i] , ht[j]) and breadth will be (j - i)
// (j - i) * min(ht[i] , ht[j]) = water 
// ht(i, j) m se jiski ht max hai uska index change kroge 
// (increment if i has max ht or decrement for j has max ht) kroge
//  toh water km hoga hi hoga 
// else ht(i, j) m se jiski ht min hai uska index change kroge 
// toh water may increase if height got incresed

class Solution {
    public int maxArea(int[] height) {
        int i = 0 ; 
        int j = height.length - 1;

        int water = 0 ;

        while(i < j){
            int l = Math.min(height[i], height[j]);
            int b = j - i;
           
            int curr_water = l * b;

            // maximum water
            water = Math.max(water, curr_water);
            
            // change index of min ht -- potential chance of water increase
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water;
    }
}