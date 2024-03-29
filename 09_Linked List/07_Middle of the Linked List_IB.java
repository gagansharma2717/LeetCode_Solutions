// 876. Middle of the Linked List https://leetcode.com/problems/middle-of-the-linked-list/

// Using slow fast approach
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null)
        {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // For odd --> fast != null && For even
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}