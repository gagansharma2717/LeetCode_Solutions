class Solution {
    public void traversal(TreeNode node, List<Integer> res){
        if(node == null) return;

        res.add(node.val);

        traversal(node.left, res);
        traversal(node.right, res);
    }
    public List<Integer> preorderTraversal(TreeNode node) {
        List<Integer> res = new ArrayList<>();

        traversal(node, res);

        return res;
    }
}

// Iterative Pre-Order used stack
// level preorder is root right left bcoz of stack
public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) return res;

        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);

        while(stk.size() > 0)
        {
            TreeNode node = stk.pop();

            res.add(node.val);

            if(node.right != null){
                stk.push(node.right);
            }

            if(node.left != null){
                stk.push(node.left);
            }
        }
        return res;
    }
}