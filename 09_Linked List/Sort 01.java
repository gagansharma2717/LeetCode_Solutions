 // Sort Binary Linked List - InterviewBit
// https://www.interviewbit.com/problems/sort-binary-linked-list/

public class Solution {
    public ListNode solve(ListNode head) {
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
                
        ListNode zeroTail = zeroHead, oneTail = oneHead;
        
        while(head != null){
            if(head.val == 0){
               zeroTail.next = head;
               zeroTail = head;
            }else if(head.val == 1){
               oneTail.next = head;
               oneTail = head;
            }
            head = head.next;
        }
        
        
        oneTail.next = null;
        zeroTail.next = oneHead.next;
        
        
        return zeroHead.next;
    }
}
