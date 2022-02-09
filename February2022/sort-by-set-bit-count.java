/*
Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

Link: https://practice.geeksforgeeks.org/problems/sort-by-set-bit-count1153/1
*/

class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        Arrays.sort(arr, new MIN());
    }
    
    static class MIN implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            int aBitCount = Integer.bitCount(a);
            int bBitCount = Integer.bitCount(b);  
            
            // Descending order
            if(aBitCount > bBitCount) {
                return -1;    
            } else if(bBitCount > aBitCount) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

/*
Time Complexity: O(nlogn)
Space Complexity: O(1)
*/
