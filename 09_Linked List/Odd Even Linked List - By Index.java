// Segregate even and odd nodes in a Link List - GFG
// https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1
// Similar like sort 01

class Solution{
    Node divide(int N, Node head){
        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        
        Node odd = oddHead , even = evenHead;
        
        while(head != null){
            if(head.data % 2 == 1){
                odd.next = head;
                odd = head;
                head = head.next;
            }else{
                even.next = head;
                even = head;
                head = head.next;
            }
        }
        
        even.next = oddHead.next;
        odd.next = null;        
        return evenHead.next;
    }
}