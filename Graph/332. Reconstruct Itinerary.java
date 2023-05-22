class Solution {
//     Three Conditions :
//     1. Itinerary or Planned Route will always start from JFK
//     2. Lexographical Order needs to be maintained
//     3. Use Ticket only once
    
    
//     We are taking Priority Queue to maintain Lexographical Order & 
//     HashMap to create Adjacency List
    HashMap<String, PriorityQueue<String>> graph;
    ArrayList<String> ans;
    public List<String> findItinerary(List<List<String>> tickets) {
        
        graph = new HashMap<>();
        ans = new ArrayList<>();
        
        for(List<String> ticket : tickets)
        {
            PriorityQueue<String> temp = graph.getOrDefault(ticket).get(0), new PriorityQueue<String>());
            temp.add(ticket.get(1));
            graph.put(ticket.get(0), temp);
        }
        
        dfs("JFK");
        
        return ans;
    }
    
    
    public void dfs(String src)
    {
        PriorityQueue<String> nbrs = graph.get(src);
        
        while(nbrs != null && nbrs.size() > 0)
        {
            String nbr = nbrs.remove();
            dfs(nbr);
        }
        
        ans.add(0, src);
    }
}

-----------------------------------------------------------------------------------------------------
// With LinkedList
class Solution {

    HashMap<String, PriorityQueue<String>> graph;
    LinkedList<String> ans;
    public List<String> findItinerary(List<List<String>> tickets) {
        
        graph = new HashMap<>();
        ans = new LinkedList<>();
        
        for(List<String> ticket : tickets)
        {
            PriorityQueue<String> temp = graph.getOrDefault(ticket.get(0), new PriorityQueue<String>());
            temp.add(ticket.get(1));
            graph.put(ticket.get(0), temp);
        }
        
        dfs("JFK");
        
        return ans;
    }
    
    
    public void dfs(String src)
    {
        PriorityQueue<String> nbrs = graph.get(src);
        
        while(nbrs != null && nbrs.size() > 0)
        {
            String nbr = nbrs.remove();
            dfs(nbr);
        }
        
        ans.addFirst(src);
    }
}