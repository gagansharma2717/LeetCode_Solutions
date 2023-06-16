import java.util.TreeMap;

/*
 * @lc app=leetcode id=1094 lang=java
 *
 * [1094] Car Pooling
 */

// @lc code=start
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer, Integer> changes = new TreeMap<>();
        
        for(int i = 0 ; i <trips.length; i++)
        {
            int passengers = trips[i][0];
            int start = trips[i][1];
            int end = trips[i][2];

            changes.put(start, changes.getOrDefault(start, 0) + passengers);
            changes.put(end, changes.getOrDefault(end, 0) - passengers);
        }
        int currPassengers = 0;

        for(Integer key : changes.keySet())
        {
            Integer val = changes.get(key);
            currPassengers += val;

            if (currPassengers > capacity)
                return false;
        }
        return true;
    }
}
// @lc code=end

