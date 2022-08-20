// 234. Palindrome Linked List

// Brute Force 
// Take another LL and make a reverse of input ll 
// and compare both if both are same then yes it is palindrome else false

// Optimized find middle then reverse input ll after that
// then use fast and slow to compare

class Solution {
    public ListNode reverseLL(ListNode head){
        ListNode prev = null, curr = head;
        
        while(curr != null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        
        return prev;
    }
    
    public ListNode middleLL(ListNode head){
        ListNode slow = head, fast = head;
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null) return prev; // even size
        
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode mid = middleLL(head);
        ListNode second = reverseLL(mid.next);
        
        while(head != null && second != null){
            if(head.val != second.val) return false;
            
            head = head.next;
            second = second.next;
        }
        
        return true;
    }
}