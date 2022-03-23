/*
Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the beginning and Kth node from the end of the linked list. 
Swap the nodes through the links. Do not change the content of the nodes.

Link: https://practice.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1#
*/

class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int n, int k)
    {
        // your code here
        if(k > n || (2 * k - 1 == n)) {
            return head;
        }
        
        Node temp1 = head;
        Node temp1Previous = null;
        for (int i = 1; i < k; i++) {
            temp1Previous = temp1;
            temp1 = temp1.next;
        }
        
        Node temp2 = head;
        Node temp2Previous = null;
        for (int i = 1; i < n - k + 1; i++) {
            temp2Previous = temp2;
            temp2 = temp2.next;
        }
        
        if(temp1Previous != null) {
            temp1Previous.next = temp2;
        }
        
        if(temp2Previous != null) {
            temp2Previous.next = temp1;
        }
        
        Node temp = temp1.next;
        temp1.next = temp2.next;
        temp2.next = temp;
        
        if(k == 1) {
            head = temp2;
        }
        
        if(k == n) {
            head = temp1;
        }
        
        return head;
    }
}
