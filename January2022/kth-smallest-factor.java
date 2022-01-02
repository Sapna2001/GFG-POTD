/*
Given two positive integers N and K. You have to find the Kth smallest factor of N. A factor of N is a positive integer which divides N. Output the Kth smallest 
factor of N if it exists otherwise print -1.

Link: https://practice.geeksforgeeks.org/problems/kth-smallest-factor2345/1
*/

class Solution {
    static int kThSmallestFactor(int n , int k) {
        // code here
        for(int i = 1 ; i * i < n ; i++) {
            if(((n % i) == 0) && (--k == 0)) {
                return i;
            }
        }
        
        for(int i = (int)(Math.sqrt(n)) ; i >= 1 ; i--) {
            if(((n % i) == 0) && (--k == 0)) {
                return n/i;
            }
        }
        
        return -1;
    }
};

/*
Time Complexity: O(sqrt(n))
Space Complexity: O(1)
*/
