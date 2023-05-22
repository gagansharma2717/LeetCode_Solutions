import java.util.Arrays;

/*
 * @lc app=leetcode id=646 lang=java
 *
 * [646] Maximum Length of Pair Chain
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
            return this.end - others.end;
        }
    }

    public int findLongestChain(int[][] pairs) {
        
        int n = pairs.length;

        Pair[] intervals = new Pair[n];

        for(int i  = 0 ; i < n ; i++)
        {
            intervals[i] = new Pair(pairs[i][0], pairs[i][1]);
        }

        Arrays.sort(intervals);

        int ans = 0, limit = Integer.MIN_VALUE;

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

