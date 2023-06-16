class Solution {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        
        for(int i = 0; i < V ; i++)
        {
            for(int nbr : adj.get(i))
            {
                indegree[nbr]++;
            }
        }
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0 ; i < V ; i++)
        {
            if(indegree[i] == 0)
            {
                que.add(i);
            }
        }
        
        int count = 0 ;
        while(!que.isEmpty())
        {
            int rem = que.poll();
            count++;
            
            for(int nbr : adj.get(rem))
            {
                indegree[nbr]--;
                if(indegree[nbr] == 0)
                {
                    que.add(nbr);
                }
            }
        }
        
        if(count == V)
        {
            return false;
        }else
        {
            return true;
        }
    }
}