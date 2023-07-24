 // GFG Given a linked list of 0s, 1s and 2s, sort it.
// https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1


class Solution
{
    
    static Node segregate(Node head)
    {
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        
        Node zeroTail = zeroHead, oneTail = oneHead, twoTail = twoHead;
        
        while(head != null){
            if(head.data == 0){
               zeroTail.next = head;
               zeroTail = head;
            }else if(head.data == 1){
               oneTail.next = head;
               oneTail = head;
            }else{
                twoTail.next = head;
                twoTail = head;
            }
            head = head.next;
        }
        
        twoTail.next = null;
        oneTail.next = twoHead.next;
        zeroTail.next = oneHead.next;
        
        
        return zeroHead.next;
    }
}
