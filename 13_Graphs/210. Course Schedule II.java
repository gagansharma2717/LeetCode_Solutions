class Solution {
    public int[] findOrder(int N, int[][] prerequisites) {
         List<Integer>[] adj = new ArrayList[N];
        
        for(int i = 0 ; i < N ; i++)
        {
            adj[i] = new ArrayList<>();
        }
        
        int[] indegree = new int[N];
        
//         Creating adjacency list as well as filling indegree array
        for(int i[] : prerequisites)
        {
            adj[i[1]].add(i[0]);
            indegree[i[0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int  i = 0 ; i < N ; i++)
        {
            if(indegree[i] == 0)
            {
                queue.add(i);
            }
        }
        
//         BFS
        int idx = 0;
        int[] result = new int[N];
        
        while(queue.size() > 0)
        {
            int rem = queue.poll();
            result[idx++] = rem;
            
            for(int nbr : adj[rem])
            {
                indegree[nbr]--;
                if(indegree[nbr] == 0)
                {
                    queue.add(nbr);
                }
            }
        }
                
        if(idx == N)
        {
            return result;
        }else
        {
            return new int[]{};
        }
        
        
    }
}