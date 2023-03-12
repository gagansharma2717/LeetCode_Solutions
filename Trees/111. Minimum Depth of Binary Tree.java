class Solution {
    public int minDepth(TreeNode root) {
        // Tree is empty
        if(root == null) return 0;

        // Only root is available
        if(root.left == null && root.right == null){
            return 1;
        }

        // left is not available
        if(root.left == null){
            return 1 + minDepth(root.right);
        }

       // right is not available 
       if(root.right == null){
            return 1 + minDepth(root.left);
        }

        // Node with both Children
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

Follow Up : Minimum Path Sum from root node to any leaf node
TC : O(N)
SC : O(H) Recursion call stack space
O(log n) - balanced average case
O(N) skewed tree worst case