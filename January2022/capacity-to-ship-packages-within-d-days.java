/*
Given an array arr[] of N weights. Find the least weight capacity of a boat to ship all weights within D days.
Note: You have to load weights on the ship in the given order.

Link: https://practice.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1#
*/

class Solution {
    private static int requiredDays(int capacity, int[] arr) {
        int sum = 0, count =1;
        for(int weight : arr) {
            if(weight > capacity) {
                return Integer.MAX_VALUE;    
            }
            
            if(sum + weight <= capacity) {
                sum += weight;
            } else {
                count++;
                sum = weight;
            }
        }
        
        return count;
    }
    
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int start = 1, end = (int)1e9;
        while(start < end) {
            int mid = start + (end - start) / 2;
            int days = requiredDays(mid, arr);
            if(days <= D) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
};

/*
Time Complexity: O(nlogn)
Space Complexity: O(1)
*/
