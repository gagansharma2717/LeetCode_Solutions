// 61. Rotate List
// https://leetcode.com/problems/rotate-list/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        // Compute Size
        ListNode curr = head;
        int size = 1;
        while(curr.next != null){
            size++;
            curr = curr.next;
        }
        
        // Last node se head pr link bnaya like circular linked list
        curr.next = head;
        k = k % size; // modules because K can be greater than size off LL
        k = size - k; // isse hm pointing change krenge
        
        // uss position tak move kiya
        while(k-- > 0) curr = curr.next;
        
        // head change kiya
        head = curr.next;
        curr.next = null; //end of LL bnaya
        
        return head; // rotated list ka head return krdiya
    }
}