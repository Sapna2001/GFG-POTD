/*
Given two n-ary trees. Check if they are mirror images of each other or not. You are also given e denoting the number of edges in both trees, and two arrays, A[] 
and B[]. Each array has 2*e space separated values u,v denoting an edge from u to v for the both trees.

Link: https://practice.geeksforgeeks.org/problems/check-mirror-in-n-ary-tree1528/1
*/

class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        // code here
        Map<Integer, Stack<Integer>> map = new HashMap<Integer, Stack<Integer>>();
        
        for(int i = 0 ; i < 2 * e ; i+= 2) {
            if(!map.containsKey(A[i])) {
                map.put(A[i],new Stack<>());    
            }  
            map.get(A[i]).push(A[i+1]);
        }
        
        for(int i = 0 ; i < 2 * e ; i+= 2) {
            if(map.get(B[i]).pop() != B[i+1]) {
                return 0;
            }  
        }
        
        return 1;
    }
};


/*
Time Complexity: O(e)
Space Complexity: O(e)
*/

                
     
