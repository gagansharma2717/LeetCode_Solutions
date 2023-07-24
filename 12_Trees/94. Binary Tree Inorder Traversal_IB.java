// Recursive
class Solution {
    public void traversal(TreeNode node, List<Integer> res){
        if(node == null) return;

        traversal(node.left, res);

        res.add(node.val);

        traversal(node.right, res);
    }
    public List<Integer> inorderTraversal(TreeNode node) {
       List<Integer> res = new ArrayList<>();

        traversal(node, res);

        return res;
    }
}

//Iterative - Using Stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode node) {
       List<Integer> res = new ArrayList<>();
       Stack<TreeNode> stk = new Stack<>();
       TreeNode root = node;

       while(true){
           if(node != null){
                stk.push(node);
                node = node.left;
            }
            else{
                if(stk.isEmpty()){
                    break;
                }

                node = stk.pop();
                res.add(node.val);
                node = node.right;
            }
       }

       return res;
    }
}