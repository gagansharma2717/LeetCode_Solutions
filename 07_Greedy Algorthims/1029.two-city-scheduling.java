import java.util.Arrays;

/*
 * @lc app=leetcode id=1029 lang=java
 *
 * [1029] Two City Scheduling
 */

// @lc code=start
class Solution {
    public int twoCitySchedCost(int[][] costs) {

        Arrays.sort(costs , (x,y) -> ((y[1] - y[0]) - (x[1] - x[0])));

        int sum = 0;
        for(int i = 0 ; i <costs.length/2; i++)
        {
            sum += costs[i][0];
            sum += costs[costs.length-1 - i][1];
        }

        return sum;
        
    }
}
// @lc code=end

