https://leetcode.com/problems/number-of-operations-to-make-network-connected/

class Solution {
    ArrayList<ArrayList<Integer>> graph;
    public int makeConnected(int n, int[][] connections) {
        buildGraph(connections,n);

        boolean[] visited = new boolean[n];
        int connectedComponents = 0 ;

        for(int i = 0 ; i < n ; i++)
        {
            if(!visited[i])
            {
                dfs(graph,i,visited);
                connectedComponents++;
            }
        }
//         If No of Edges is equal to No of computers minus 1 then Network is possible which will
//         be connectedComponents-1 otherwise -1 . connectedComponents-1 here minus 1 because
//         after it becomes a network It will be a single component
        return connections.length >= n-1 ? connectedComponents-1 : -1;
    }

    public void dfs( ArrayList<ArrayList<Integer>> graph, int src, boolean[] visited)
    {
        visited[src] = true;

        for(int nbr : graph.get(src))
        {
            if(!visited[nbr])
            {
                dfs(graph,nbr,visited);
            }
        }
    }

    public void buildGraph(int[][] connections, int n){
        graph = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int  i = 0 ; i < connections.length ; i++)
        {
            for(int j = 0 ; j < 2; j++)
            {
                int src = connections[i][0];
                int nbr = connections[i][1];

                graph.get(src).add(nbr);
                graph.get(nbr).add(src);
            }
        }
    }
}