//DFS
import java.util.ArrayList;
public class Solution {
    public static boolean isGraphTree(int n, ArrayList<ArrayList<Integer>> edgeList) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge : edgeList){
            int src = edge.get(0);
            int nbr = edge.get(1);
            
            graph.get(src).add(nbr);
            graph.get(nbr).add(src);
        }
        
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            if(visited[i] == false)
            {
                boolean ans = checkCycle(graph,i,-1,visited);
                if(ans == true)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean checkCycle( ArrayList<ArrayList<Integer>> graph, int src , int par, boolean[] visited){
        visited[src] = true;
        
        for(int nbr : graph.get(src))
        {
            if(visited[nbr] == false)
            {
                boolean check = checkCycle(graph,nbr,src,visited);
                if(check == true)
                {
                    return true;
                }
            }else if(nbr != par)
            {
                return true;
            }
        }
        
        return false;
    }
}


// BFS
import java.util.*;
public class Solution {
    public static boolean isGraphTree(int n, ArrayList<ArrayList<Integer>> edgeList) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge : edgeList){
            int src = edge.get(0);
            int nbr = edge.get(1);
            
            graph.get(src).add(nbr);
            graph.get(nbr).add(src);
        }
        
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            if(visited[i] == false)
            {
                boolean ans = checkCycle(graph,i,visited);
                if(ans == true)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean checkCycle(ArrayList<ArrayList<Integer>> graph, int src , boolean[] visited){
        Queue<Integer> que = new ArrayDeque<>();
        que.add(src);
        
        while(que.size() > 0)
        {
            int rem = que.remove();
            
            if(visited[rem] == true)
            {
                return true;
            }
            
            visited[rem] = true;
            
            for(int nbr :  graph.get(rem))
            {
                if(visited[nbr] == false)
                {
                    que.add(nbr);
                }
            }
        }
        
        return false;
    }
}