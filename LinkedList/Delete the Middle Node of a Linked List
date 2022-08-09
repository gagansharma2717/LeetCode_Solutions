// 2095. Delete the Middle Node of a Linked List https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Using slow fast approach 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
        {
         return null;
        }
        
        ListNode slow= head;
        ListNode fast = head;
        // PrevNode rkha usme slow ka previous node store kiya
        ListNode prev = null;
        
        // mid find kiya
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // previous ke next mai slow ka next store kiya
        // isse slow delete ho gya
        prev.next = slow.next;
        
        return head;
    }
}

