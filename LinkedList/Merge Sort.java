// 148 Sort List
// https://leetcode.com/problems/sort-list/
// Merge Sort is inplace in case of linkedlist and prefered
// Quick sort is prefered in array with randomize
class Solution {
    public ListNode mergeTwoSortedLL(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null){
            return head1!= null ? head1 : head2;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        ListNode c1 = head1;
        ListNode c2 = head2;

        while(c1 != null && c2 != null){

            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }else{
                prev.next = c2;
                c2 = c2.next;
            }

            prev = prev.next;
        }

        prev.next = c1 != null ? c1 : c2;

        return dummy.next;
    }

    public ListNode middleNode(ListNode head){
        if(head == null || head.next == null ) return head;
        ListNode slow = head, fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        // Find mid
        ListNode mid = middleNode(head);
        // Break the list 
        ListNode midNext = mid.next;
        mid.next = null; 
        
        // Then break the list further
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(midNext);
        
        // Then merge two sorted linkedlist
        return mergeTwoSortedLL(l1, l2);
    }
}