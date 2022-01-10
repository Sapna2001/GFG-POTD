/*
A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Link: https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
*/

class Solution
{
    private static Node reverse(Node head) {
        Node previous = null, current = head, next = null;
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
    
    private static Node addOneLL(Node head) {
        Node result = head, temp = null, previous = null;
        int carry = 1, sum = 0;
        
        while(head != null) {
            sum = carry + head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum %= 10;
            head.data = sum;
            
            temp = head;
            head = head.next;
        }
        
        if(carry > 0) {
            temp.next = new Node(carry);
        }
        
        return result;
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        head = reverse(head);
        
        head = addOneLL(head);
        
        head = reverse(head);
        
        return head;
    }
}
