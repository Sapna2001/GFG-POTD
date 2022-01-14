/*
Given a BST, modify it so that all greater values in the given BST are added to every node.

Link: https://practice.geeksforgeeks.org/problems/add-all-greater-values-to-every-node-in-a-bst/1
*/

class Solution{
    private int sum;
    
    private void reverseInorderTraversal(Node root) {
        if(root == null) {
            return;
        }
        
        reverseInorderTraversal(root.right);
        root.data += sum;
        sum = root.data;
        
        reverseInorderTraversal(root.left);
    }
    
    // modify the BST and return its root
    public Node modify(Node root)
    {
        //Write your code here
        sum = 0;
        reverseInorderTraversal(root);
        return root;
    }
    
}
