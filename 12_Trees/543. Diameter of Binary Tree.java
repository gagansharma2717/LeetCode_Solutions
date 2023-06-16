// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// The length of a path between two nodes is represented by the number of edges between them. 

// Length will longest distance between leaf node to leaf node.

// lh + rh + 2 (max dist between left's deepest and right deepest)
// + 2 bcoz left child to right child travel requires 2 edges i.e. left -> root -> right
// ld(left depth) (faith) - max distance between 2 nodes on LHS

// rd (faith) - max distance between 2 nodes on RHS

class Solution { 
    static class diaPair{
        int ht;
        int dia;

        diaPair(){
            ht = -1; // in terms of edges
            dia = 0;
        }
    }
    public diaPair diameter(TreeNode node){
        if(node == null){
            return new diaPair();
        }

        diaPair ld = diameter(node.left);
        diaPair rd = diameter(node.right);

        diaPair md = new diaPair();
        md.ht = Math.max(ld.ht, rd.ht)+1;

        int f = (ld.ht + rd.ht) + 2;
        md.dia = Math.max(f , Math.max(ld.dia, rd.dia));

        return md;
    }
    public int diameterOfBinaryTree(TreeNode root) {
           diaPair res = diameter(root);

           return res.dia;
    }
}

