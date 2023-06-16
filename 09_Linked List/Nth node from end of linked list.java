// Nth node from end of linked list https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

// Brute-Force 2 traversals
class GfG
{
    int getNodeAt(Node head, int k){
        Node temp = head;
        
        for(int i = 0 ; i < k ; i++){
            temp = temp.next;
        }
        
        return temp.data;
    }

    int getNthFromLast(Node head, int n)
    {
        Node temp = new Node(0);
        temp = head;
        int size = 1;
        
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        
        if(n > size) return -1;
        else return getNodeAt(head, size-n);
    	
    }
}


// Two Pointers Optimized
class GfG
{
  
    int getNthFromLast(Node head, int k)
    {
    	Node slow = head;
    	Node fast = head;
    	
    	while(fast != null && k-- > 0){
    	    fast = fast.next;
    	}
    	
    	// If fast becomes 0 but k still has value means required nodes
    	// are not present in linkedlist
    	if(k > 0) return -1;
    	
    	while(fast != null){
    	    slow = slow.next;
    	    fast = fast.next;
    	}
    	
    	return slow.data;
    }
}
