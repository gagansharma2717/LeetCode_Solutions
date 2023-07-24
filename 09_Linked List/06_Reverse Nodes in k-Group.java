// 25. 2 https://leetcode.com/problems/reverse-nodes-in-k-group/

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;   // this dummy's next will finally point to output head
        
        // we will have 3 pointers to work on swapping nodes
        ListNode prev = dummy, curr = dummy, next = dummy;
        
        // count the size of the linked list
        int count = 0;
        while(curr.next != null) {
            count++;
            curr = curr.next;
        }
        // possible groups = count/k
        // we will have a while loop which runs till count >= k and decrement the count each time a group was done with the operation.
        while(count >= k) {
            // now update curr and next pointers for next group
            curr = prev.next;
            next = curr.next;
            // 1 each group will have k-1 operations to perform
            for(int i=1; i < k; i++) {
    	        curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            // 2 For the first group after the above for loop dummy's next will point to 3 (output head)
            // and curr will point to 1 and group will become 3-2-1
            // so update prev for next group and decrease the count
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}


// Recursive
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       if (head == null || head.next == null || k == 1) {
            return head;
        }

        ListNode curr = head, prev = null, next = null;
        int count = 0;
        while (count < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        head.next = reverseKGroup(next, k);
        
        if(count < k) {
            return reverseKGroup(prev, count);
        }

        return prev; 
    }
}