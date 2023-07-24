// Merge two sorted linked lists
// https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

class LinkedList
{

    Node sortedMerge(Node head1, Node head2) {
     if(head1 == null || head2 == null ){
         return head1 != null ? head1 : head2;
     }
     
     Node c1 = head1;
     Node c2 = head2;
     Node dummy = new Node(0);
     Node prev = dummy;
     
     while(c1 != null && c2 != null){
         
         if(c1.data < c2.data){
             prev.next = c1;
             c1 = c1.next;
         }else{
             prev.next = c2;
             c2 = c2.next;
         }
         
         prev = prev.next;
     }
     
     // for unequal list either c1 is not null or c2 is not null
     // so we simply link prev.next whatever linkedlist is not null
     prev.next = c1 != null ? c1 : c2;
     
     
     return dummy.next;
   } 
}

// O(n+m)

// LeetCode - 21
// https://leetcode.com/problems/merge-two-sorted-lists/submissions/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null || list2 == null){
            return list1 != null ? list1 : list2;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        
        ListNode c1 = list1;
        ListNode c2 = list2;
        
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
}