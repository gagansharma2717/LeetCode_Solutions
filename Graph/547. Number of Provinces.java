https://leetcode.com/problems/number-of-provinces/

class Solution {
    class Edge{
        int src;
        int nbr;
        
        Edge(int src, int nbr){
            
            this.src = src;
            this.nbr = nbr;
        }
    }
    public int findCircleNum(int[][] isConnected) {
         
        int n = isConnected.length;
        int res = 0;
        
        ArrayList<Edge>[] graph = new ArrayList[n];
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(isConnected[i][j] == 1 && i != j)
                {
                    int src = i;
                    int nbr = j;
                    
                    graph[src].add(new Edge(src,nbr));
                    graph[nbr].add(new Edge(nbr,src));
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            if(!visited[i]){
                
                dfs(graph, i , visited);
                res++;
            }
        }
        
        return res;
    }
    
    public void dfs(ArrayList<Edge>[] graph, int src, boolean[] visited)
    {
        visited[src] = true;
        
        for(Edge e : graph[src])
        {
            if(!visited[e.nbr])
            {
                 dfs(graph,e.nbr,visited);
            }
        }
    }
}