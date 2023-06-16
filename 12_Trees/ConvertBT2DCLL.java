// Covert Binary Tree to Circular Doubly Linked List

/* Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
} */

class Solution
{ 
    //Function to convert binary tree into circular doubly linked list.
    Node prev = null, head = null;
    Node bTreeToClist(Node root)
    {
        if(root == null) return null;
        
        Node left = bTreeToClist(root.left);
        
        if(left == null && prev == null)
        {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        
        prev = root;
        
        Node right = bTreeToClist(root.right);
        
        if(right == null){
            head.left = prev;
            prev.right = head;
        }
        
        return head;
    }
    
}
    
