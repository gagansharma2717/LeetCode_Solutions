class Solution {
  
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
      boolean[] visited = new boolean[V];
      
      for(int i = 0 ; i < V ; i++)
      {
          if(!visited[i])
          {
              if(dfs(i,-1,adj,visited))
              {
                  return true;
              }
          }
      }
      return false;
    }
    
    public boolean dfs(int src , int par, ArrayList<ArrayList<Integer>> adj, boolean[] visited)
    {
        visited[src] = true;
        
        for(int nbr : adj.get(src))
        {
            if(!visited[nbr])
            {
                if(dfs(nbr,src,adj,visited))
                {
                    return true;
                }
            }else if(par != nbr){
                return true;
            }
        }
        return false;
    }
}