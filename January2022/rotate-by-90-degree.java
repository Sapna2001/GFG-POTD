/*
Given a square matrix[][] of size N x N. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Link: https://practice.geeksforgeeks.org/problems/rotate-by-90-degree0356/1
*/

class GFG
{
    private static void transpose(int matrix[][], int n) {
        for(int i = 0 ; i < n ; i++) {
            for(int j = i ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    private static void reverse(int matrix[][], int n) {
        for(int i = 0 ; i < n/2 ; i++) {
            for(int j = 0 ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }    
    }
    
    static void rotate(int matrix[][]) 
    {
        // Code Here
        int n = matrix.length;
        transpose(matrix, n);
        reverse(matrix, n);
    }
}
