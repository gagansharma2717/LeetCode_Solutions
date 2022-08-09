// 4.
// 237. Delete Node in a Linked List https://leetcode.com/problems/delete-node-in-a-linked-list/
// Cannot Use pointers in it because head given nhi h
// directly node given hai so node se end tak LinkedList ke data copy kro
// then tail reach krne pr uske next m null daal do 
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        
        while(curr.next.next != null){
            curr.val = curr.next.val;
            curr = curr.next;
        }
        
        // For Last node of LL
        curr.val = curr.next.val;
        curr.next = null;
    }
}