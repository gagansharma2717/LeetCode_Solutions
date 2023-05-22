// 143. Reorder List
// https://leetcode.com/problems/reorder-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middle(ListNode head){
        ListNode slow = head , fast = head;
        ListNode prev = head;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null) return prev;
        
        return slow;
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
                
        while(curr != null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
               
        return prev;
    }
    public void reorderList(ListNode head) {
        
        ListNode mid = middle(head); // find mid
        ListNode second = reverse(mid.next); // make reverse of second -half
        mid.next = null;
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        
        // Either head is not null or second half is not null
        while(head != null || second != null){
            // if head is not null update tail and head
            if(head != null){
                tail.next = head;
                tail = head;
                head = head.next;
            }
            
            // if second is not null update tail and second 
            if(second != null){
                tail.next = second;
                tail = second;
                second = second.next; 
            }
            
        }

       tail.next = null;
       head = dummy.next; // void return type hai toh head ki pointing chnage krdo
    }
}