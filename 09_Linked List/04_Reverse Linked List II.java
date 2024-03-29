// 92. Reverse Linked List II https://leetcode.com/problems/reverse-linked-list-ii/
// Data Iterative
class Solution {
    
    public ListNode getNodeAt(ListNode head , int index){
        ListNode curr = head;
        
        for(int i =0 ; i < index; i++){
            curr = curr.next;
        }
        
        return curr;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        
        while(left < right){
            ListNode lft = getNodeAt(head,left-1);
            ListNode rht = getNodeAt(head,right-1);
            
            int temp = lft.val;
            lft.val = rht.val;
            rht.val = temp;
            
            left++;
            right--;
        }
        
        return head;
    }
}