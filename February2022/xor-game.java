/*
Given a positive number k, we need to find a minimum value of positive integer n, such that XOR of n and n+1 is equal to k. If no such n exist then print -1.

Link: https://practice.geeksforgeeks.org/problems/xor-game2143/1#
*/

class Solution{
    static int xorCal(int k){
        // code here
        if(k == 1) {
            return 2;
        }
        
        if((k & k+1) == 0) {
            return k/2;
        }
        
        return - 1;
    }
}

/*
Time Complexity: O(1)
Space Complexity: O(1)
*/
