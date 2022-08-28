// Flattening a Linked List
// https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1

class GfG
{
    
    Node mergeTwoLists(Node A, Node B){
        
        Node temp = new Node(0);
        Node res = temp;
        
        while(A != null && B != null){
            if(A.data < B.data){
               temp.bottom = A;
               temp = temp.bottom;
               A = A.bottom;
               
            }else{
               temp.bottom = B;
               temp = temp.bottom;
               B = B.bottom;
            }
        }
        
        if(A != null) temp.bottom = A;
        else temp.bottom = B;
        
        return res.bottom;
        
    }
    Node flatten(Node root)
    {
        // root ke next means last linkedlist pr stand krke usko return kiya
        if(root == null || root.next == null){
            return root;
        }
        
        // recurring for the list on right till last
        root.next = flatten(root.next);
        // so root.next m hme last linkedlist mila
        // so root me usse pichle linkedlist hi hoga postorder m recursion ke
        // lets say we have 5 ll and root.next mai last ll hai
        // toh root mai 4th hi hoga
        // so now merge them 
        root = mergeTwoLists(root, root.next);
        
	    return root; // It will merge with it left till first LL
    }
}