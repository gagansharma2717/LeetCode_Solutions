class Solution {
    
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> graph) {
    
    int[] visited = new int[V];
	int[] dfsVisited = new int[V];
	
	for(int i = 0 ; i < V ; i++)
	{
		if(visited[i] == 0)
		{
			if(checkCycle(graph,i,visited,dfsVisited) == true)
			{
				return true;
			}
		}
	}
	
	return false;
}
    
public boolean checkCycle(ArrayList<ArrayList<Integer>> graph, int src, int[] visited, int[] dfsVisited){
	visited[src] = 1;
	dfsVisited[src] = 1;
	
	for(int nbr : graph.get(src))
	{
		if(visited[nbr] == 0)
		{
			if(checkCycle(graph,nbr,visited,dfsVisited) == true)
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