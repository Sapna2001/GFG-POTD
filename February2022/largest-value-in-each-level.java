/*
Given a binary tree, find the largest value in each level.

Link: https://practice.geeksforgeeks.org/problems/largest-value-in-each-level/1
*/

class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
        //code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int len = queue.size(), max = Integer.MIN_VALUE;;
            for(int i = 0; i < len; i++) {
                Node top = queue.poll();
                int val = top.data;
                max = Math.max(max, val);
                
                if(top.left != null) {
                    queue.add(top.left);    
                }
                
                if(top.right != null) {
                    queue.add(top.right);    
                }
            }
            
            result.add(max);
        }
        
        return result;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
