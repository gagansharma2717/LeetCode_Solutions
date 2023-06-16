// 83. Remove Duplicates from Sorted List https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Using AddLast Approach

class Solution {
    // temporary head = th and tt = temporary tail;
    ListNode th = null, tt = null;
    public void addLast(ListNode node){
        if(tt == null){
            th = tt = node;
        }else{
            tt.next = node;
            tt = node;
        }
    }
    // Using AddLast Approach
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        
        ListNode curr = head;
        while(curr != null){
            // forward = forw;
            // Storing curr ka next
            ListNode forw = curr.next;
            // breaking the connection from current
            curr.next = null;
            
            // if temptail is null ya temp tail value is not equal to current val toh addLast krlo
            if(tt == null || tt.val != curr.val) addLast(curr);
            
            // curr pointer ko aage move krdo 
            curr = forw;
        }
        
        return th;
    }
}

// Using dummy node
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(head != null){
            
            if(tail == dummy || head.val != tail.val){
                tail.next = head;
                tail = head;    
            }
            
            head = head.next;
        }        
                
        tail.next = null;
        return dummy.next;
    }
}

