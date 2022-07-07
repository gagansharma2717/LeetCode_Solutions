// 37.
// GFG https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1#
// Similar like Flood Fill

class Solution {
    static ArrayList<String> res;
    
     public static void findAllPaths(int sr, int sc, int[][] maze, boolean[][] vis, String ans){
        // Negative Base Case
        // Out of Maze                                                      //blockage node      // visited cell
        if( sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 0 || vis[sr][sc] == true ){
            return;
        }
        
        // Positive Base case
        if(sr == maze.length-1 && sc == maze[0].length-1){
            res.add(ans);
            return;
        }
        
      
      
          
        vis[sr][sc] = true;    
            
        findAllPaths(sr+1, sc, maze, vis, ans + "D");
        findAllPaths(sr, sc-1, maze, vis, ans + "L");
        findAllPaths(sr, sc+1, maze, vis, ans + "R");
        findAllPaths(sr-1, sc, maze, vis, ans + "U");
        
        vis[sr][sc] = false;
       
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
       res = new ArrayList<>();
       boolean[][] vis = new boolean[n][n];
       findAllPaths(0,0, m, vis, "");
       return res;
    }
}

// Instead of using visited array we can use -1 in the same matrix itself.
// Approach 2 Space Optimized
class Solution {
    static ArrayList<String> res;
    
     public static void findAllPaths(int sr, int sc, int[][] maze, String ans){
        // Negative Base Case
        if( sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 0 || maze[sr][sc] == -1){
            return;
        }
    
        
        // Positive Base case
        if(sr == maze.length-1 && sc == maze[0].length-1){
            res.add(ans);
            return;
        }
        
      
      
          
        maze[sr][sc] = -1;    
            
        findAllPaths(sr+1, sc, maze,  ans + "D");
        findAllPaths(sr, sc-1, maze,  ans + "L");
        findAllPaths(sr, sc+1, maze,  ans + "R");
        findAllPaths(sr-1, sc, maze,  ans + "U");
        
        maze[sr][sc] = 1;
       
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
       res = new ArrayList<>();
       
       findAllPaths(0,0, m, "");
       return res;
    }
}