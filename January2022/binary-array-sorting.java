/*
Given a binary array A[] of size N. The task is to arrange the array in increasing order.
Note: The binary array contains only 0  and 1.

Link: https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1#
*/

class Solution
{
    //Function to sort the binary array.
    static void binSort(int arr[], int n)
    {
        // add your code here
        
        
        /**************
        * No need to print the array
        * ************/
        int count0 = 0;
        
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] == 0) {
                count0++;
            }
        }
        
        for(int i = 0 ; i < count0 ; i++) {
            arr[i] = 0;
        }
        
        for(int i = count0 ; i < n ; i++) {
            arr[i] = 1;
        }
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(N)
*/
