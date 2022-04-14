class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        dfs(graph,res,path,0);
        
        return res;
    }
    
    private void dfs(int[][] graph, List<List<Integer>> res,List<Integer> path, int src)
    {
//         Adding Element in Path ArrayList
        path.add(src);
        
//         If the source reaches to last element we will create new arraylist in result and add the ///         path arraylist in it
        if(src == graph.length-1)
        {
            res.add(new ArrayList(path));
        }
        else{
//             Else Source ke neighbours pr loop lgakr dfs chalaya 
            for(int nbr : graph[src]){
            dfs(graph,res,path,nbr);   
            path.remove(path.size()-1);
//              Removing last element from path arraylist for backtracking purpose to explore //////               other paths
            }
        }
    }
}