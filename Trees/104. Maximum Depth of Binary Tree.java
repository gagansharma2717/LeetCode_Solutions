// Maximum Height of Binary Tree in terms of Node
// For Edges, we just need to add this method in helper and while return the output
// to main just subtract minus 1.
class Solution {
    public int maxDepth(TreeNode node) {
        if(node == null){
            return 0;
        }

        int ld = maxDepth(node.left);
        int rd = maxDepth(node.right);

        int td = Math.max(ld, rd) + 1;
        return td;
    }
}