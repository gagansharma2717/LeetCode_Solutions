class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
        int hd; // horizontal distance
        Node node;
        
        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        
        q.add(new Pair(0,root));
        
        while(q.size() > 0){
            Pair curr = q.remove();
            
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }
            
            if(curr.node.left != null){
                q.add(new Pair(curr.hd-1, curr.node.left));    
            }
            
            if(curr.node.right != null){
                q.add(new Pair(curr.hd+1, curr.node.right));
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            ans.add(entry.getValue());
        }  
        
        return ans;
    }
}