import java.util.Arrays;

/*
 * @lc app=leetcode id=853 lang=java
 *
 * [853] Car Fleet
 */

// @lc code=start
class Solution {
    public static class Pair implements Comparable<Pair>
    {
        int distance;
        int speed;
        double time;

        Pair(int distance, int speed)
        {
            this.distance = distance;
            this.speed = speed;
            this.time = ((distance * 1.0) / speed);
        }

        public int compareTo(Pair others)
        {
            return this.distance - others.distance;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        
        int n = position.length;

        Pair[] cars = new Pair[n];
        
        for(int i = 0 ; i<n; i++)
        {
            cars[i] = new Pair(target - position[i], speed[i]);
        }

        Arrays.sort(cars);

        double maxTime = 0.0;

        int countofGroups = 0;

        for(int i = 0 ; i <n ; i++)
        {
            if (cars[i].time > maxTime) {
                countofGroups++;
                maxTime = cars[i].time;
            }
        }
        
        return countofGroups;
        
    }
}
// @lc code=end

