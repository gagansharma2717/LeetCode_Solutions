// Check If Circular Linked List GFG
// Floyd Cycle Detection

class GfG
{
    boolean isCircular(Node head)
    {
	    Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast && slow == head) return true;
        }
        
        return false;
    }
}