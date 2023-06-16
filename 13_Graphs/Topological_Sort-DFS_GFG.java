//https://practice.geeksforgeeks.org/problems/topological-sort/1
// This Sort is only applicable for directed graph. Topological Sort is a linear ordering of vertices
// such taht if there is an edge between u -> v then u vertex will come before v
// Basically DFS hi h Bs isme stack bhi use hota h. Postorder m aate h vertices ko stack m add krlo

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] visited = new int[V];
        Stack<Integer> stk = new Stack<Integer>();
        
        for(int i = 0 ; i < V ; i++)
        {
            if(visited[i] != 1)
            {
                dfs(adj,i,visited,stk);
            }
        }
        
        int[] result = new int[V];
        int idx = 0 ;
        
        while(stk.size() > 0)
        {
            result[idx++] = stk.pop();
        }
        
        return result;
    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int src, int[] visited, Stack<Integer> stk)
    {
        visited[src] = 1;
        
        for(int nbr : graph.get(src))
        {
            if(visited[nbr] != 1)
            {
                dfs(graph, nbr, visited, stk);
            }
        }
        
        stk.push(src);
    }
}
