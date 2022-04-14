import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        for(int i = 0 ; i<intervals.length; i++)
        {
            int[] lastInt = merged.get(merged.size() - 1);
            int[] currInt = intervals[i];

            if (lastInt[1] >= currInt[0]) {
                //merge
                lastInt[1] = Math.max(lastInt[1], currInt[1]);
            } else {
                merged.add(currInt);
            }
        }
        
        int[][] res = new int[merged.size()][2];

        for(int i = 0 ; i < merged.size(); i++)
        {
            res[i] = merged.get(i);
        }
        return res;  
    }
}
// @lc code=end

