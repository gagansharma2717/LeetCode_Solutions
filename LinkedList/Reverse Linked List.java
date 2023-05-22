// .
// 206. Reverse Linked List https://leetcode.com/problems/reverse-linked-list/

class Solution {
    
    // Pointer Iterative
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr != null){
            // Storing current ka next before breaking the connection
            ListNode currNext = curr.next;

            // Making the reverse kink
            curr.next = prev;
            
            // increasing both pointers by 1
            prev = curr;
            curr = currNext;
        }
        
        // At the end curr will be null and prev will be at the end 
        // so make the prev as head and return it
        head = prev;
        return head;
    }
}

