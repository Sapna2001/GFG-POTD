/*
Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two
numbers.

Link: https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
*/

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] result = new int[2];
        
        for(int i = 0 ; i < n ; i++) {
            int no = Math.abs(arr[i]);
            if(arr[no - 1] < 0) {
                result[0] = no;
            } else {
                arr[no - 1] = -arr[no - 1];
            }
        }
        
        for(int i = 0 ; i < n ; i++) {
            int no = arr[i];
            if(no > 0) {
                result[1] = i + 1; 
                break;
            }
        }
        
        return result;
    }
}

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
