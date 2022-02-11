/*
Given an IP address, remove leading zeros from the IP address. Note that our IP address here can be a little different. It can have numbers greater than 255. Also, 
it does not necessarily have 4 numbers. The count can be lesser/more.

Link: https://practice.geeksforgeeks.org/problems/remove-leading-zeros-from-an-ip-address3530/1
*/

class Solution
{
    public static String removeZeros(String s) {
        int i;
        for(i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) != '0') {
                break;
            }
        }
        
        String result = s.substring(i);
        return result.length() > 0 ? result : "0";
    }
    
    public String newIPAdd(String s)
    {
        // your code here
        String[] parts = s.split("[.]");
        StringBuilder result = new StringBuilder("");  
        
        for(int i = 0 ; i < parts.length ; i++) {
            String modifiedPart = removeZeros(parts[i]) + ".";
            result.append(modifiedPart); 
        }
        
        result = result.delete(result.length() - 1, result.length());
        
        return result.toString();
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
