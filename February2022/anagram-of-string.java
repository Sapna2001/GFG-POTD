/*
Given two strings S1 and S2 in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find the minimum 
number of characters to be deleted to make both the strings anagram. Two strings are called anagram of each other if one of them can be converted into another by 
rearranging its letters.

Link: https://practice.geeksforgeeks.org/problems/anagram-of-string/1#
*/

class GfG {
	public int remAnagrams(String s1,String s2) {
        //add code here.
        int[] arr = new int[26];
        int l1 = s1.length(), l2 = s2.length();
        
        for(int i = 0 ; i < l1 ; i++) {
            arr[s1.charAt(i) - 'a']++;     
        }
        
        for(int i = 0 ; i < l2 ; i++) {
            arr[s2.charAt(i) - 'a']--;     
        }
        
        int result = 0;
        
        for(int i = 0 ; i < 26 ; i++) {
            result += Math.abs(arr[i]);
        }
        
        return result;
        }
}

/*
Time Complexity: O(n)
Space Complexity: O(26)
*/
