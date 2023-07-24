class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    static class Pair{
        int hd; // horizontal distance
        Node node;
        
        public Pair(int hd, Node node){
            this.hd = hd;
            this.node = node;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, Integer> map = new TreeMap<>();
        
        q.add(new Pair(0,root));
        
        while(q.size() > 0){
            Pair curr = q.remove();
            
            map.put(curr.hd, curr.node.data);
            
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