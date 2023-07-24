class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;

        // If anyone of them is equal to root toh root hi lca hai 
        if(root == p || root == q)
            return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // if left and right both are not null so root hi ancestor hoga so return root
        if(left != null && right != null)
            return root;

        
        // Another case if left is null so return right and if left is not null retun left
        return left != null ? left : right;
        
    }
}

// LCA of 3 Nodes
public class Solution {
    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2,
            int node3) {
        if(root == null)
            return null;

        // If anyone of them is equal to root toh root hi lca hai 
        if(root.data == node1 || root.data == node2 || root.data == node3)
            return root;
        
        BinaryTreeNode left = lcaOfThreeNodes(root.left, node1, node2, node3);
        BinaryTreeNode right = lcaOfThreeNodes(root.right, node1, node2, node3);

        // if left and right both are not null so root hi ancestor hoga so return root
        if(left != null && right != null)
            return root;

        
        // Another case if left is null so return right and if left is not null retun left
        return left != null ? left : right;
        
    }
}
