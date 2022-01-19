/*
Given n arrays of size m each. Find maximum sum obtained by selecting a number from each array such that the element selected from the i-th array is more than 
the element selected from (i-1)-th array. If maximum sum cannot be obtained then return 0.

Link: https://practice.geeksforgeeks.org/problems/maximum-sum-of-increasing-order-elements-from-n-arrays4848/1
*/

class Complete{
    // Function for finding maximum and value pair
    public static int maximumSum (int n, int m, int arr[][]) {
        //Complete the function
        int sum = 0, previous = Integer.MAX_VALUE;
        for(int i = n - 1 ; i >= 0 ; i--) {
            int max = Integer.MIN_VALUE;
            for(int j = m - 1; j >= 0 ; j--) {
                if(previous > arr[i][j]) {
                    max = Math.max(max, arr[i][j]);
                }
            }
            
            if(max == Integer.MIN_VALUE) {
                return 0;   
            }
                
            sum += max;
            previous = max;
        }
        
        return sum;
    }
}

/*
Time Complexity: O(N*M)
Auxiliary Space: O(1)
*/
