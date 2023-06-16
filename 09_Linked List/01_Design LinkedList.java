// 1.
// 707 LeetCode https://leetcode.com/problems/design-linked-list/

class Node{
    Node next;
    int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
}

class MyLinkedList {
    Node head;
    Node tail;
    int size;
    
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(size == 0){
            return -1;
        }
        if(index < 0 || index > size-1){
            return -1;
        }
        
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(size == 0){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        
        Node temp = new Node(val);
        if(size == 0){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else if(index < 0 || index > size){
            
        }
        else {
            
            Node newNode = new Node(val);
            Node temp = head;
            Node prevNode = head;
            
            for(int i=0; i<index-1; i++){
                temp = temp.next;
                prevNode = prevNode.next;
            }
            
            temp = temp.next;
            prevNode.next = newNode;
            newNode.next = temp;
            size++;
        }
    }
    
    public void deleteFirst(){
        if(size == 1){
                head=null;
                tail=null;
                size--;
        }else{
                head=head.next;
                size--;
             }
    }
    
    public void deleteLast(){
        
        Node temp=head;
        for(int i = 0; i < size-2; i++){
                temp=temp.next;
        }
            
        temp.next = null;
        tail = temp;
        size--; 
        
    }
    public void deleteAtIndex(int index) {
        if(size==0){
            
        }
        else if(index < 0 || index >= size){
            
        }
        else if(index==0){
            // delete first
            deleteFirst();
        } 
        else if(index==size-1){
            // delete last
            deleteLast();
        }
        else{
            Node temp=head;
            Node prevNode=head;
        
            for(int i=0;i < index-1; i++){
                temp = temp.next;
                prevNode = prevNode.next;
            }
            
            temp = temp.next.next;
            prevNode.next = temp;
            size--;
        }
    }
}