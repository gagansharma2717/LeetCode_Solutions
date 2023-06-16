class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[V];

        for(int i = 0 ; i < V ; i++)
        {
            if(visited[i] == false)
            {
                dfs(i,visited,adj,res);
            }
        }

        return res;
    }

    public void dfs(int src, boolean[] visited,ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> res)
    {
        res.add(src);

        visited[src] = true;

        for(Integer it : adj.get(src)){
            if(visited[it] == false)
            {
                dfs(it,visited,adj,res);
            }
        }
    }
}