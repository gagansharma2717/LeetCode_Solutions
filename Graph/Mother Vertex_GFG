class Solution
{
    public int count = 0 ;
    public int findMotherVertex(int N, ArrayList<ArrayList<Integer>>adj)
    {
        Stack<Integer> stk = new Stack<>();
        boolean[] visited = new boolean[N];
        
        for(int i = 0 ; i < N ; i++)
        {
            if(!visited[i])
            {
                dfs(i,adj,visited,stk);
            }
        }
        
        int potentialMV = stk.pop();
        visited = new boolean[N];
        
        dfs(potentialMV, adj, visited);
        
        if(count == N)
        {
            return potentialMV;
        }else
        {
            return -1;
        }
    }
    
    public void dfs(int src , ArrayList<ArrayList<Integer>>graph, boolean[] visited, Stack<Integer> stk)
    {
        visited[src] = true;
        
        for(int nbr : graph.get(src))
        {
            if(!visited[nbr])
            {
                dfs(nbr,graph,visited,stk);
            }
        }
        
        stk.push(src);
    }
    
    public void dfs(int src , ArrayList<ArrayList<Integer>>graph, boolean[] visited)
    {
         visited[src] = true;
         count++;
        for(int nbr : graph.get(src))
        {
            if(!visited[nbr])
            {
                dfs(nbr,graph,visited);
            }
        }
    }
}