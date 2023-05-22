//Cycle in a Directed Graph

class Solution {
    public int[] findOrder(int N, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
//         List Bnai
        for(int i = 0 ; i < N ; i++)
        {
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : prerequisites)
        {
            int src = edge[1];
            int nbr = edge[0];
            
            adj.get(src).add(nbr);
        }
//          2 visited array bnaye
        int[] visited = new int[N];
        int[] dfsVisited = new int[N];
        
//         cycle check kiya if cycle exist return empty array
        for(int i = 0 ; i < N ; i++)
        {
            if(visited[i] == 0)
            {
                if(checkCycle(adj, i, visited, dfsVisited))
                {
                    return new int[0];
                }
            }
        }
        
//         Normal Topological Sort
        Stack<Integer> stk = new Stack<>();
        visited = new int[N];
        
        for(int i = 0 ; i < N ; i++)
        {
            if(visited[i] == 0)
            {
                dfs(i,adj,visited,stk);
            }
        }
        
        int[] result = new int[N];
        int idx = 0 ;
        while(stk.size() > 0)
        {
            result[idx++] = stk.pop();
        }
        
        return result;
    }
    
    public void dfs(int src , List<List<Integer>> adj,int[] visited , Stack<Integer> stk)
    {
        visited[src] = 1;
        
        for(int nbr : adj.get(src))
        {
            if(visited[nbr] == 0)
            {
                dfs(nbr,adj,visited,stk);
            }
        }
        
        stk.push(src);
    }
    
    public boolean checkCycle(List<List<Integer>> adj, int src, int[] visited, int[] dfsVisited)
    {
        visited[src] = 1;
        dfsVisited[src] = 1;
        
        for(int nbr  : adj.get(src))
        {
            if(visited[nbr] == 0)
            {
                if(checkCycle(adj,nbr,visited,dfsVisited))
                {
                    return true;
                }
            }
            else if(dfsVisited[nbr] == 1)
            {
               return true; 
            }
        }
        
        dfsVisited[src] = 0;
        return false;
            
    }
    
}