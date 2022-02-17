/*
Geek has developed an effective vaccine for Corona virus and he wants each of the N houses in Geek Land to have access to it. Given a binary tree where each node 
represents a house in Geek Land, find the minimum number of houses that should be supplied with the vaccine kit if one vaccine kit is sufficient for that house, 
its parent house and it's immediate child nodes.  

Link: https://practice.geeksforgeeks.org/problems/d1afdbd3d49e4e7e6f9d738606cd592f63e6b0f0/1
*/

class Solution{
    static int vaccine = 0;
    
    private static int vaccineRequired(Node root) {
        if(root == null) {
            return -1;
        } 
        
        int left = vaccineRequired(root.left), right = vaccineRequired(root.right);
        
        if(left == 1 || right == 1) {
            vaccine++;
            return 0;
        }
        
        if(left == 0 || right == 0) {
            return -1;
        }
        
        return 1;
    }
    
    public static int supplyVaccine(Node root){
        // Your code goes here
        vaccine = 0;
        
        if(vaccineRequired(root) == 1) {
            vaccine++;
        }
        
        return vaccine;
    }
}
