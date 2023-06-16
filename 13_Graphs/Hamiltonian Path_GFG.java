class Solution 
{ 
    static ArrayList<ArrayList<Integer>> graph;
    static int vertex;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        vertex = N;
        graph = new ArrayList<>();
        
        for(int i = 0 ; i <= N; i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(ArrayList<Integer> edge : Edges)
        {
            int src = edge.get(0);
            int nbr = edge.get(1);
            
            graph.get(src).add(nbr);
            graph.get(nbr).add(src);
        }
        
        boolean[] visited = new boolean[N+1];
        
        for(int i = 1 ; i <= N ; i++)
        {
            if(!visited[i] && dfs(i,visited,1))
            {
                return true;
            }
        }
        
        return false;
    } 
    
    boolean dfs(int src , boolean[] visited , int counter)
    {
        if(counter == vertex)
        {
            return true;
        }
        
        visited[src] = true; 
        
        for(Integer nbr : graph.get(src)){
            if(!visited[nbr] && dfs(nbr,visited,counter+1)){
                return true;
            }
        }
        
        visited[src] = false;
        
        return false;
    }
    
} 