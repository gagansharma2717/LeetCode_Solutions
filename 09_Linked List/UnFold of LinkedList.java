  // Basic Idea is 2 linkedlist bnai ek odd ko process kregi second one will process even nodes
// at last second ko reverse krke first one se link kr denge
// PepCoding

public ListNode reverse(ListNode head){
    ListNode prev = null, curr = head;

    while(curr != null){
        ListNode ahead = curr.next;
        curr.next = prev;
        prev = curr;
        curr = ahead; 
    }

    return prev;
}

public void unFold(ListNode head){
    ListNode firstHead = new ListNode(-1);
    ListNode secondHead = new ListNode(-1);
    ListNode first = firstHead, second = secondHead; // Here first and second are tail nodes

    while(head!= null){
        // Processing 1 node and all odd nodes
        first.next = head;
        first = head;
        head = head.next;

        // if even is there will process even nodes
        if(head != null){
            second.next = head;
            second = head;
            head = head.next;
        }
    }

    first.next = null;
    second.next = null;

    //revering second linkedlist and linking with first
    first.next = reverse(secondHead.next);

    // return type is void so updating head
    head = firstHead.next;
}
