/*
Given an integer N, print all the N digit numbers in increasing order, such that their digits are in strictly increasing order(from left to right).

Link: https://practice.geeksforgeeks.org/problems/n-digit-numbers-with-digits-in-increasing-order5903/1#
*/

class Solution{
    private static void helper(ArrayList<Integer> result, int start, int index, char[] ch) {
        if(index == ch.length) {
            result.add(Integer.parseInt(String.valueOf(ch)));
            return;
        }  
        
        for(int i = start + 1; i < 10 ; i++) {
            ch[index] = (char)('0' + i);
            helper(result, i, index + 1, ch);
        }
    }
    
    static ArrayList<Integer> increasingNumbers(int n){
        // code here
        ArrayList<Integer> result = new  ArrayList<Integer>();
        
        if(n == 1) {
            result.add(0);
        }
        
        helper(result, 0, 0, new char[n]);
        return result;
    }
}

