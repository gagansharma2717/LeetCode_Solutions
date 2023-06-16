f// Remove loop in Linked List GFG
// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        
        // remove the loop without losing any nodes
        
        Node slow = head, fast = head, prev = head;
  
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) break;
        }
        
        // loop found
        if(slow == fast){
            // fast is on head now
            fast = head;
            // meeting pt tak aaye and then last node which is prev ke next m null place kiya
            while(slow  != fast ){
                prev = slow;
                slow = slow.next;
                fast = fast.next;
            }
            
            prev.next = null;
        }else{
            return;
        }
         
    }
    
}
