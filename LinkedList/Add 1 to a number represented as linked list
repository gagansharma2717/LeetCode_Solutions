// GFG 
// https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

class Solution
{
    
public static Node reverse(Node head)
   {
       Node prev = null;
       Node cur = head;
       
       while(cur!=null)
       {
           Node ahead = cur.next;
           cur.next = prev;
           prev = cur;
           cur = ahead;
       }
       return prev;
   }
   public static Node addOne(Node head) 
   { 
      
       Node newHead = reverse(head);
       
       Node cur = newHead, prev = null, cur1 = newHead;
       int carry = 0;
       
       while(cur != null)
       {
           int sum = 0;
           
           if(prev == null)
           {
               sum = cur.data + 1;
           }
           else{
               sum = cur.data + carry;
           }
           carry = sum / 10;
           cur.data = sum % 10;
           prev = cur ;
           cur = cur.next;
       }
       
       if(carry == 1)
      { 
          Node addNode = new Node(1);
          prev.next = addNode;
      }
      return reverse(cur1);
   }
}


