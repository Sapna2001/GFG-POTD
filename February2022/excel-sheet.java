/*
Given a positive integer N, return its corresponding column title as it would appear in an Excel sheet.
For N =1 we have column A, for 27 we have AA and so on.

Note: The alphabets are all in uppercase.

Link: https://practice.geeksforgeeks.org/problems/excel-sheet5448/1
*/

class Solution {
    public String excelColumn(int n){
        //  Your code here
        String result = new String();
        while(n != 0) {
            char ch  = (char)((int)'A' + (n - 1) % 26);
            result = ch + result;
            n = (n - 1) / 26;
        }
        
        return result;
    }
}
