// https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1

class Solution {
    
    public Node insertInMid(Node head, int data){
        Node slow = head;
        Node fast = head;
        Node newNode = new Node(data);
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Note : Before breaking existing connection make a new connection first 
        newNode.next = slow.next;
        slow.next = newNode;
        
        return head;
        
    }
}