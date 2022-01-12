/*
Given two binary trees with head reference as T and S having at most N nodes. The task is to check if S is present as subtree in T.
A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.

Link: https://practice.geeksforgeeks.org/problems/check-if-subtree/1
*/

class Solution {
    private static boolean isSameTree(Node t, Node s) {
        if((t == null) || (s == null)) {
            return ((t == null) && (s == null));
        } else if(t.data == s.data) {
            return isSameTree(t.left, s.left) && isSameTree(t.right, s.right);
        } else {
            return false;
        }
    }
    
    public static boolean isSubtree(Node t, Node s) {
        // add code here.
        if(t == null) {
            return false;
        } else if(isSameTree(t, s)) {
            return true;
        } else {
            return isSubtree(t.left, s) || isSubtree(t.right, s);
        }
    }
}
