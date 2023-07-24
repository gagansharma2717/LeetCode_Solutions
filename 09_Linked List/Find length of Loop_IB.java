// Find length of Loop 
// https://practice.geeksforgeeks.org/problems/find-length-of-loop/1

class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break; // cycle detected
        }
        
        if(fast == null || fast.next == null){
            return 0;  // no cycle
        }
         
        // cycle milte hi 1 distance curr ka from slow.next 
       int dist = 1;
       Node curr = slow.next;
       // run loop till it reaches slow and increase dist and at last return distance
       while(curr != slow){
            dist++;
            curr = curr.next;
        }
        
        return dist;
    }
}
