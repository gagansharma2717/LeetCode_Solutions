// Reverse a Linked List in groups of given size https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

class Solution
{
    public static Node reverse(Node head, int k)
    {
       if(head ==null)
       return null;
       
       Node curr = head;
       Node prev = null;
       int cnt = 1;
       while(curr != null && cnt <= k)
       {
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           cnt++;
       }
       head.next = reverse(curr,k);
       return prev;
    }
}