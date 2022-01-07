/*
Given an N bit binary number, find the 1's complement of the number. The ones' complement of a binary number is defined as the value obtained by inverting all the 
bits in the binary representation of the number (swapping 0s for 1s and vice versa).

Link: https://practice.geeksforgeeks.org/problems/1s-complement2819/1
*/

class Solution{
    static String onesComplement(String s,int n){
        //code here
        String result = "";
        for(int i = 0 ; i < n ; i++) {
            char ch = s.charAt(i);
            if(ch == '1') {
                result += "0";
            } else {
                result += "1";
            }
        }
        
        return result;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(N)
*/
