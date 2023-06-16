Class Solution{
    static class Pair{
        int state;
        TreeNode node;

        Pair(int state, TreeNode node){
            this.state = state;
            this.node = node;
        }

    }
    public void preInPostTraversal(TreeNode root){  
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        Stack<Pair> stk = new Stack<>();
        stk.push(new Pair(root, 1));

        while(!stk.isEmpty()){
            Pair top = stk.pop();

            if(top.state == 1){
                pre.add(top.node.val);
                top.state++;
            
                if(top.node.left != null){
                    stk.push(new pair(top.node.left, 1));
                }
            }else if(top.state == 2){
                in.add(top.node.val);
                top.state++;

                if(top.node.right != null){
                    stk.push(new pair(top.node.right,1));
                }
            }else{
                post.add(top.node.val);
                stk.pop();
            }
        }
    }
}
TC : O(3N)