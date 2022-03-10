/*
Using seven segment display, you can write down any digit from 0 to 9 using at most seven segments. Given a positive number N and then a string S representing a 
number of N digits. You have to rearrange the segments in this N digit number to get the smallest possible N digit number. This number can have leading zeros. 
You can not waste any segment or add any segment from your own. You have to use all of the segments of the given N digits.

Link: https://practice.geeksforgeeks.org/problems/7-segment-display0752/1
*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.sevenSegments(S,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String sevenSegments(String str, int n) {
        // code here
        int[] segmentCount = {6,2,5,5,4,5,6,3,7,5};
        int sum = 0;
        
        for(int i = 0 ; i < n ; i++) {
            int ch = str.charAt(i) - '0';
            sum += segmentCount[ch];
        }
        
        // Fill 2 segments everywhere
        int[] minSegment = new int[n];
        for(int i = 0 ; i < n ; i++) {
            sum -= 2;
            minSegment[i] = 2;
        }
        
        // Fill 0 in the start
        int i = 0;
        while(sum >= 4 && i < n) {
            minSegment[i] = 6;
            sum -= 4;
            i++;
        }
        
        // Fill 0 in the start
        int j = n - 1;
        while(sum > 0 && j >= 0) {
            int required = 7 - minSegment[j];
            minSegment[j] += Math.min(required, sum);
            sum -= Math.min(required, sum);
            j--;
        }
       
        String result = ""; 
        for(i = 0 ; i < n ; i++) {
            int val = minSegment[i];
            switch(val) {
                case 6: 
                    result += '0'; 
                    break;
                case 2: 
                    result += '1'; 
                    break;
                case 5: 
                    result += '2'; 
                    break;
                case 4: 
                    result += '4'; 
                    break;
                case 3: 
                    result += '7'; 
                    break;
                case 7: 
                    result += '8'; 
                    break;
            }
        }
        
        return result;
    }
};

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/
