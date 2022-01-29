/*
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Link: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1
*/

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        ArrayList<Integer> index = new ArrayList<Integer>();
        index.add(0);
        
        for(int i = 0 ; i < S.length() ; i++) {
            if(S.charAt(i) == '.') {
                index.add(i);
            }
        }
        
        index.add(S.length());
        StringBuilder result = new StringBuilder(""); 
        
        for(int i = index.size() - 2; i > 0 ; i--) {
            String str = S.substring(index.get(i) + 1, index.get(i + 1));
            result.append(str);
            result.append(".");
        }
        
        String str = S.substring(index.get(0), index.get(1));
        result.append(str);
        
        return result.toString();
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
