// 82. Remove Duplicates from Sorted List II https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        // dummy node and iterator pointing to dummy node
        ListNode dummy = new ListNode(-1);
        ListNode itr = dummy;
        itr.next = head; // potential unique element
        ListNode curr = head.next;
        
        while(curr != null){
            boolean isLoopRun = false;
            // If itr ke next ki val is equal to curr value and both are not null then increase current and make flag true
            while(curr != null && itr.next.val == curr.val){
                isLoopRun = true;
                curr = curr.next;
            }
            
            
            // if flag is true then move the itr to curr else move the itr to its next
            if(isLoopRun) itr.next = curr;
            else itr = itr.next;
            
            // If current is not at last then move curr
            if(curr != null) curr = curr.next;
        }
        
        
        return dummy.next;
    }
}