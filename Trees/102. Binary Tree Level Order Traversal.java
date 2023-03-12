2class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while(queue.size() > 0){
            int count = queue.size();
            List<Integer> ans = new ArrayList<>();

            while(count-- > 0){
                // remove
                TreeNode node = queue.remove();

                // print or add in answer
                ans.add(node.val);

                // add children in queue
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(ans);
        }

        return res;
    }
}

