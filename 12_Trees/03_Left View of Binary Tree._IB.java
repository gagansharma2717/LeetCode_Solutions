class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(root,list,0);
        
       return list;
    }
    
    void helper(Node root, ArrayList<Integer> list, int level){
        if(root == null) return;
        
        if(list.size() == level) 
        { 
            list.add(level,root.data);
        }
        
        helper(root.left, list, level+1);
        helper(root.right, list, level+1);
    }
}