class Solution{
    //Function to return list containing elements of right view of binary tree.
    
    ArrayList<Integer> rightView(Node node) {
        
       ArrayList<Integer> list = new ArrayList<>();
        
       helper(node,list,0);
        
       return list;
    }
    
    void helper(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if(list.size() == level) 
        { 
            list.add(level,root.data);
        }
        
        helper(root.right, list, level+1);
        helper(root.left, list, level+1);
    }
}