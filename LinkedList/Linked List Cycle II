// 142. Linked List Cycle II 
// https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null; // o or 1 node
        }
        
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) break; // cycle detected
        }
        
        if(fast == null || fast.next == null){
            return null;  // no cycle
        }
         
        
        ListNode curr1 = head, curr2 = slow;
        // cycle found now find distance from head to starting pt of loop
        while(curr1 != curr2){
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr1;
         
    }
}

// O(2n)or O(n)