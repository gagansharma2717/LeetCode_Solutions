// 138. Copy List with Random Pointer
// https://leetcode.com/problems/copy-list-with-random-pointer/
// Using Extra Space -- HashMap

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        
        // Dummy Nodes
        Node newHead = new Node(-1);
        Node prev = newHead;
        
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val); // copying linked list
            prev.next = newNode;
            map.put(curr, newNode); // adding in hashmap
            
            prev = prev.next; // move forward both pointers
            curr = curr.next;
        }
        
        newHead = newHead.next; // move dummy pointer to new head
        
        Node curr1 = head; 
        Node curr2 = newHead;
        
        while(curr1 != null){
            // we are checking only curr1 bcoz curr1 and curr2 are both of same length
            curr2.random = curr1.random != null ? map.get(curr1.random) : null;
            // if c1. random is null so we will place null in c2.random
            // edge case if random is not pointing to any node
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
            
        return newHead;
        
    }
}



// With Constant Space - 0(1)
class Solution {
    public Node copyRandomList(Node head) {
        Node curr = head;
        
        while(curr != null){
            Node forw = curr.next;  // store next of curr
            
            Node node = new Node(curr.val); // curr la copy bnaya
            curr.next = node; //  newNode ko curr and curr ke next
            node.next = forw; // ke beech mai attach kr diya
            
            curr = forw; // then move curr to its original next
        }
        
        
        // Copy Random Pointers
        curr = head;
        while(curr != null){
            Node random = curr.random;
            if(random != null){
                curr.next.random = random.next;
            }
            
            curr = curr.next.next;
        }
        
        // Extracting Deep Copy
        curr = head;
        Node dummy = new Node(-1);
        Node prev = dummy;
        
        while(curr != null){
            prev.next = curr.next;
            curr.next = curr.next.next;
            
            prev = prev.next;
            curr = curr.next;  
        }
        
        return dummy.next;
    }
}