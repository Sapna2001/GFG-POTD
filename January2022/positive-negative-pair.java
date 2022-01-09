/*
Given an array of distinct integers, find all the pairs having both negative and positive values of a number in the array.

Link: https://practice.geeksforgeeks.org/problems/positive-negative-pair5209/1
*/

class Solution
{
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	// code here.
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	
    	for(int i : arr) {
    	    int value = Math.abs(i);
    	    if(!map.containsKey(value)) {
    	        map.put(value,1);
    	    } else {
    	        map.put(value, map.get(value) + 1);
    	        if((map.get(value) % 2) == 0) {
    	            result.add(-value);
    	            result.add(value);
    	        }
    	    }
    	}
    	
    	return result;
    }
}
