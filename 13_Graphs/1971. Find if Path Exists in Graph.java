class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<Integer>[] graph = new ArrayList[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            graph[i] = new ArrayList();    
        }
        
        for(int i = 0 ; i < edges.length; i++)
        {
            int src = edges[i][0];
            int nbr = edges[i][1];
            
            graph[src].add(nbr);
            graph[nbr].add(src);
        }
        
        
        boolean[] visited = new boolean[n];
        boolean res = hasPath(graph,source,destination,visited);
        return res;
        
    }
    
    public boolean hasPath(ArrayList<Integer>[] graph, int src, int dest, boolean[] visited)
    {
        if(src == dest)
        {
            return true;
            
        }
        
        visited[src] = true;
        
        
        for(int nbr : graph[src])
        {
            if(visited[nbr] == false)
            {
                boolean hasNbrPath = hasPath(graph,nbr,dest,visited);
                
                if(hasNbrPath == true)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}