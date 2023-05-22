import java.util.Arrays;

/*
 * @lc app=leetcode id=452 lang=java
 *
 * [452] Minimum Number of Arrows to Burst Balloons
 */

// @lc code=start
class Solution {
    public static class Pair implements Comparable<Pair>
    {
        int start, end;

        Pair(int start, int end)
        {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Pair others)
        {
            if (this.end < others.end)
                return -1;
            else
                return 1;
        }
    }

    public int findMinArrowShots(int[][] points) {
        
        int n = points.length;

        Pair[] intervals = new Pair[n];

        for(int i  = 0 ; i < n ; i++)
        {
            intervals[i] = new Pair(points[i][0], points[i][1]);
        }

        Arrays.sort(intervals);

        int ans = 1, limit = intervals[0].end;

        for (int i = 0; i < n; i++)
        {
            if(intervals[i].start > limit)
            {
                ans++;
                limit = Math.max(intervals[i].end, limit);
            }
        }

        return ans;
        
    }
}
// @lc code=end

