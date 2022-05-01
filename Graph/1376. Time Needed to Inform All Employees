class Solution {
    List<List<Integer>> graph = new ArrayList<>();
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        for(int i = 0 ; i < n ; i++)
        {
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            if(manager[i] == -1)
            {
                continue;
            }
            graph.get(manager[i]).add(i);
        }
        
        return dfs(graph, headID, informTime);
        
    }
    
    public int dfs(List<List<Integer>> graph,int headID,int[] informTime)
    {
        int ans = informTime[headID];
        int max = 0 ;
        for(int subOrdinate : graph.get(headID))
        {
            max = Math.max(max , dfs(graph, subOrdinate, informTime));
        }
        
        return max + ans;
    }
}