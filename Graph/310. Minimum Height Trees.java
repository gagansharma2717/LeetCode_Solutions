class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        
        if(n == 0)
        {
            return result;
        }
        
        if(n == 1)
        {
            result.add(0);
            return result;
        }
        
        int[] indegree = new int[n];
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            graph.add(new ArrayList());
        }
        
        for(int[] e : edges)
        {
            indegree[e[0]]++;
            indegree[e[1]]++;
            graph.get(e[0]).add(e[1]); // src ==> nbr
            graph.get(e[1]).add(e[0]); // nbr ==> src
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i < n ; i++)
        {
            if(indegree[i] == 1)
            {
                q.add(i);
            }
        }
        
        while(n > 2)
        {
            int size = q.size();
            n = n-size;
            
            while(size-- > 0)
            {
                int rem = q.poll();
                
                for(int nbr : graph.get(rem))
                {
                    indegree[nbr]--;
                    if(indegree[nbr] == 1)
                    {
                        q.add(nbr);
                    }
                }
                
            }          
        }
        
        result.addAll(q);
        return result;
    }
}