/*
Given a number N having only one ‘1’ and all other ’0’s in its binary representation, find position of the only set bit. If there are 0 or more than 1 set bit the 
answer should be -1. Position of  set bit '1' should be counted starting with 1 from LSB side in binary representation of the number.

Link: https://practice.geeksforgeeks.org/problems/find-position-of-set-bit3706/1#
*/

class Solution {
    static int findPosition(int n) {
        // code here
        int count = 0, position = 1, position1 = 0;
        if(n == 0) {
            return -1;
        }
        
        while(n != 0) {
            int rem = n % 2;
            if(rem == 1) {
                count++;
                position1 = position;
            }
            
            if(count > 1) {
                return -1;
            }
            
            n /= 2;
            position++;
        }
        
        return position1;
    }
};

/*
Time Complexity: O(length of binary representation)
Space Complexity: O(1)
*/
