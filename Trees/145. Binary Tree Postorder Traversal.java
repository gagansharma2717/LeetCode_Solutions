class Solution {
    public void traversal(TreeNode node, List<Integer> res){
        if(node == null) return;

        traversal(node.left, res);
        traversal(node.right, res);

        res.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode node) {
        List<Integer> res = new ArrayList<>();

        traversal(node, res);

        return res;
    }
}

// Iterative using 2 stacks
class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
       Stack<TreeNode> stk1 = new Stack<>();
       Stack<TreeNode> stk2 = new Stack<>();
       List<Integer> res = new ArrayList<>();

       if(root == null) return res;

       stk1.push(root);

       while(!stk1.isEmpty()){
           root = stk1.pop();
           stk2.push(root);

           if(root.left != null) stk1.push(root.left);
           if(root.right != null) stk1.push(root.right);
       }

       while(!stk2.isEmpty()){
        res.add(stk2.pop().val);
       }

       return res;
    }
}

TC : o(n)
SC : 2(n) 




