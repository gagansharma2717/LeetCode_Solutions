// Fill Indegree Array. Indegree is no of incoming edges
// Then 0 indegree vale vertices queue m push kiya then queue ka first element remove kiya uske
// adjacents ka indegree value decrement kiya and agar vo decrement value 0 ho gya h toh queue m
// push kr diya and otherwise next element ko queue m push kiya and so on.

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] result = new int[V];
        int[] indegree = new int[V];
        
        // Filling Indegree Array
        for(int i = 0 ; i < V ; i++)
        {
            for(int nbr : adj.get(i))
            {
                indegree[nbr]++;
            }
        }
        
        // Adding vertices in queue if indegree of vertex is 0
        Queue<Integer> queue = new LinkedList<>(); 
        for(int i = 0 ; i < V ; i++)
        {
            if(indegree[i] == 0)
            {
                queue.add(i);
            }
        }
        
        // NormaL BFS
        int idx = 0 ;
        while(queue.size() > 0)
        {
            int rem = queue.poll();
            
            result[idx++] = rem;
            
            for(int nbr : adj.get(rem))
            {
                indegree[nbr]--;
                if(indegree[nbr] == 0)
                {
                    queue.add(nbr);
                }
            }
        }
        
        
        if(idx == V)
        {
            return result;
        }else{
            return new int[]{-1};
        }
    }
}