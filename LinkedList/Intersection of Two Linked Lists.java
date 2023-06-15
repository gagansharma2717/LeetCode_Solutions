// 160 Intersection of Two Linked Lists LeetCode
// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution {
    
    public int getSize(ListNode head){
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        
        if(sizeA > sizeB){
            int diff = sizeA-sizeB;
            for(int i = 0; i < diff; i++){
                headA = headA.next;
            }
        }else{
            int diff = sizeB-sizeA;
            for(int i = 0; i < diff; i++){
                headB = headB.next;
            }
        }
        
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA;
    }
}


// Using Floyd Cycle
public class Solution {
    public ListNode detectCycle(ListNode head){
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast ) break;
        }
        
        if(fast == null || fast.next == null){
            return null; // no cycle
        }
        
        ListNode curr1 = slow, curr2 = head;
        while(curr1 != curr2)
        {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tailB = headB;
        
        while(tailB.next != null){
            tailB = tailB.next;
        }
        
        tailB.next = headB;
        ListNode ans = detectCycle(headA);
        tailB.next = null;
        
        return ans;
    }
}