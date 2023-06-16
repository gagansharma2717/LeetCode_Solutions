// 3. 
// 203. Remove Linked List Elements https://leetcode.com/problems/remove-linked-list-elements/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        
        if(head == null) return null;
        
        while(curr != null){
            // If current node value is equal to given node value
            if(curr.val == val){
                // Ya toh toh head node hogi ya koi or node
                if(curr == head){
                    head = curr.next;
                    curr = head;
                }            
                else{
                    prev.next = curr.next;
                    curr = prev.next;
                }
            }
            else{
                // else move both pointers
                prev = curr;
                curr = curr.next;
            }
        }
                   
        return head;
        
    }
}