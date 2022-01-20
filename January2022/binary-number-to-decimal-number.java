/*
Given a Binary Number B, find its decimal equivalent.

Link: https://practice.geeksforgeeks.org/problems/binary-number-to-decimal-number3525/1#
*/

class Solution
{
    public int binary_to_decimal(String str)
    {
        // Code here
        int power = 0, result = 0;
        for(int i = str.length() - 1 ; i >= 0 ; i--) {
            char ch = str.charAt(i);
            int no = Character.getNumericValue(ch); 
            result += no * Math.pow(2, power);
            power++;
        }
        
        return result;
    }
}
