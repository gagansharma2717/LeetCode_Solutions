// 146. LRU Cache -- Least Recently Used
// https://leetcode.com/problems/lru-cache/
// If we are trying to get some node from cache if we get that node that is called cache hit
// if we didn't find that node that is  called page fault or cache missed

class LRUCache {
    // Node Structure
    public static class Node{
        int key;
        int val;
        Node next;
        Node prev;
        
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    
    // Initial Requirements
    Node head ,tail;
    Map<Integer, Node> map;
    int size = 0, capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        
        head = new Node(0,0);
        tail = new Node(0,0);
        map = new HashMap<>();
            
        // Initial links 
        head.next = tail;
        tail.prev = head;
        
        size = 0;
        
    }
    
    public int get(int key) {
        if(map.containsKey(key) == false){
            return -1; // map m key present nhi h toh return -1;
        }
        
        Node curr = map.get(key); // Node nikala
        
        // remove at
        curr.prev.next = curr.next;  //Node remove kiya
        curr.next.prev = curr.prev;
        
        //Add First
        curr.prev = head; // First pr add kiya
        curr.next = head.next;
        curr.prev.next = curr;
        curr.next.prev = curr;
        
        return curr.val; // value return kr diya
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key) == false){
            // hashmap mai key present nhi hai
            // Node bnaya
            Node curr = new Node(key,value);
            
            // check kiya size capacity ke equal hai ya nhi
            // equal hai toh last se remove kiya and map se bhi
            // nhi toh size bdaya and first pr node add kiya and map m bhi
            if(size == capacity){
                // Remove last
                Node temp = tail.prev;
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                map.remove(temp.key);
            }else{
                size++;
            }
            
            // Add First
            curr.prev = head;
            curr.next = head.next;
            curr.prev.next = curr;
            curr.next.prev = curr;
            map.put(key, curr);
            
        }else{
        // key present hai map mai
        // toh node nikala key se 
        // remove kiya and add first kiya only in DLL and then node ka value update krdiya

        // Update 
        Node curr = map.get(key);
        
        // remove at
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        
        //Add First
        curr.prev = head;
        curr.next = head.next;
        curr.prev.next = curr;
        curr.next.prev = curr;
        
        curr.val = value;
        }
    }
}
