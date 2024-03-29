// 86. Partition List
// https://leetcode.com/problems/partition-list/

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lHead = new ListNode(-1);
        ListNode lTail = lHead;
        ListNode rHead = new ListNode(-1);
        ListNode rTail = rHead;
        
        while(head != null){
            if(head.val < x){
                lTail.next = head;
                lTail = head;
            }else{
                rTail.next = head;
                rTail = head;
            }
            head = head.next;
        }
        
        lTail.next = rHead.next;
        rTail.next = null;
        
        return lHead.next;
    }
}