/*
Given a binary tree with a value associated with each node, we need to choose a subset of these nodes such that sum of chosen nodes is maximum under a constraint 
that no two chosen node in subset should be directly connected that is, if we have taken a node in our sum then we can’t take its any children or parents in 
consideration and vice versa.

Link: https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1#
*/

class Solution {
    private static HashMap<Node, Integer> hashmap = new HashMap<Node, Integer>();
    
    private static int helper(Node root) {
        if(root == null) {
            return 0;
        }    
        
        if(hashmap.containsKey(root)) {
            return hashmap.get(root);
        }
        
        int including = 0, excluding = 0;
        including += root.data;
        
        if(root.left != null) {
            including += helper(root.left.left);
            including += helper(root.left.right); 
        }
        
        if(root.right != null) {
            including += helper(root.right.left);
            including += helper(root.right.right); 
        }
        
        excluding += helper(root.left);
        excluding += helper(root.right);
        
        int result = Math.max(including, excluding);
        hashmap.put(root, result);
        return result;
    }
    
    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        // add your code here
        return helper(root);
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
