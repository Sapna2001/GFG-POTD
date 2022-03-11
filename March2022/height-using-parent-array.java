/*
Given a parent array arr[] of a binary tree of N nodes. Element at index i in the array arr[] represents the parent of ith node, i.e, arr[i] = parent(i). 
Find the height of this binary tree.

Link: https://practice.geeksforgeeks.org/problems/height-using-parent-array4103/1#
*/

class Solution{
    public static int findHeight(int n, int arr[]){
        // code here
        int height = 1;
        int i = arr[n - 1];
        while(arr[i] != -1) {
            height++;
            i = arr[i];
        }
        
        height++;
        return height;
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
*/
