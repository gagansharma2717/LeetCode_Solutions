// 23. Merge k Sorted Lists -- hard
// https://leetcode.com/problems/merge-k-sorted-lists/
// Using divide and conquer
class Solution {
    public ListNode mergeTwoSortedLL(ListNode head1, ListNode head2){
        if(head1 == null || head2 == null){
            return head1 != null ? head1 : head2;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        ListNode c1 = head1;    
        ListNode c2 = head2;
        
        while(c1 != null && c2 != null){
            if(c1.val < c2.val){
                prev.next = c1;
                c1 = c1.next;
            }else{
                prev.next = c2;
                c2 = c2.next;
            }
            
            prev = prev.next;
        }
        
        prev.next = c1 != null ? c1 : c2;
        
        return dummy.next;
    }
        
    public ListNode mergeKLists(ListNode[] lists, int si, int ei) {
        // si = starting index, ei = ending index
        
        if(si > ei) return null;
        
        if(si == ei) return lists[si];
        
        int mid = (si + ei) / 2;
        
        ListNode l1 = mergeKLists(lists, si, mid);
        ListNode l2 = mergeKLists(lists, mid + 1 , ei);
        
        return mergeTwoSortedLL(l1, l2);
            
    }
    
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        
        return mergeKLists(lists, 0 , lists.length-1);
        
    }
}

// Using Priority-Queue

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->{
           return a.val - b.val; // default behaviour : min heap -> this-other
           // return b.val - a.val; max heap : other-this
        });
        
        // Adding heads of all lists in pq ithey are not null
        for(ListNode l : lists) if(l != null) pq.add(l);
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        
        while(pq.size() != 0){
            ListNode node = pq.remove();
            
            prev.next = node;
            prev = prev.next;
            node = node.next;
            
            if(node != null) pq.add(node);
        }
        
        return dummy.next;
    }
}