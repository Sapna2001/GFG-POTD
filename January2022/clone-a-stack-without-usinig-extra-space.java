/*
Given elements of a stack, clone the stack without using extra space.

Link: https://practice.geeksforgeeks.org/problems/clone-a-stack-without-usinig-extra-space/1
*/

class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        // code here
        while(!st.isEmpty()) {
            Integer topValue = st.pop();
            int count = 0;
            while(!cloned.isEmpty()) {
                st.push(cloned.pop());
                count++;
            }
            cloned.push(topValue);
            for(int i = 0 ; i < count ; i++) {
                cloned.push(st.pop());    
            }
        }
    }
