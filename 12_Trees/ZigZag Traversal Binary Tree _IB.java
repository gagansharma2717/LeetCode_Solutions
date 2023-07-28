lass GFG
{
    
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(root == null) return ans;
	   
	    Queue<Node> q = new ArrayDeque<>();
	    q.add(root);
	    boolean flag = false; // to identify level
	    
	    while(q.size() > 0){
	        int n = q.size();
	        ArrayList<Integer> temp = new ArrayList<>();
	        
	        for(int i = 0 ; i < n ; i++){
	            Node curr = q.poll();
	            
	            // add
	            temp.add(curr.data);
	            
	            if(curr.left != null){
	                q.add(curr.left);
	            }
	            
	            if(curr.right != null)
	            {
	                q.add(curr.right);
	            }
	            
	        }
	        if(flag){
	            Collections.reverse(temp);
	        }
	            
	        for(int val : temp){
	            ans.add(val);
	        }
	            
	        flag = !flag;
	 
	    }
	    return ans;
	}
}