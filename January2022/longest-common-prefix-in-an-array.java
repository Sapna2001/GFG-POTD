/*
Given a array of N strings, find the longest common prefix among all strings present in the array.

Link: https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1
*/

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        if(arr.length == 0) {
            return "-1";
        }
        
        String prefix = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }    
        }
        
        return (prefix.length() == 0) ? "-1" : prefix;
    }
}
