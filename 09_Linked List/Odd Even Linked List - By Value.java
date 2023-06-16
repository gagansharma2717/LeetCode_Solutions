// 328. Odd Even Linked List LeetCode
// Similar like unfold linked list
//

class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        
        ListNode odd = oddHead , even = evenHead;
        
        while(head != null){
            // Processing 1 node and all odd nodes
            odd.next = head;
            odd = head;
            head = head.next;

        // if even is there will process even nodes
        if(head != null){
            even.next = head;
            even = head;
            head = head.next;
            }
        }
       
        even.next = null;
        odd.next = evenHead.next;
        return oddHead.next;
    }
}

