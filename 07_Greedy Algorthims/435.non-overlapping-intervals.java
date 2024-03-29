import java.util.Arrays;

/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */

// @lc code=start
class Solution {
        public static class Pair implements Comparable<Pair> {
        int start, end;
        Pair(int start, int end)
        {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Pair others)
        {
            return this.end - others.end;
        }
    }

    public int eraseOverlapIntervals(int[][] nums) {
        
        int n = nums.length;

        Pair[] intervals = new Pair[n];

        for(int i = 0 ; i <n ; i++)
        {
            intervals[i] = new Pair(nums[i][0], nums[i][1]);
        }

        Arrays.sort(intervals);

        int ans = 0, limit = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(intervals[i].start >= limit)
            {
                ans++;
                limit = Math.max(limit, intervals[i].end); 
            }
        }

        return n-ans;
    }
}
// @lc code=end

