class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] dfsVisited = new boolean[n];
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            if(!visited[i])
            {
                dfs(graph,i,visited,dfsVisited);
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            if(!dfsVisited[i])
            {
                result.add(i);
            }
        }
        
        return result;
    }
    
    public boolean dfs(int[][] graph, int src, boolean[] visited, boolean[] dfsVisited )
    {
        visited[src] = true;
        dfsVisited[src] = true;
        
        for(int nbr : graph[src])
        {
            if(!visited[nbr])
            {
                if(dfs(graph,nbr,visited,dfsVisited))
                {
                    return true;
                }
            }
            else if(dfsVisited[nbr] == true){
                return true;
            }
        }
        
        return dfsVisited[src] = false;
    }
}