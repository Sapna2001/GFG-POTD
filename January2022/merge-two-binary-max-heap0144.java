/*
Given two binary max heaps as arrays, merge the given heaps to form a new max heap.

Link: https://practice.geeksforgeeks.org/problems/merge-two-binary-max-heap0144/1#
*/

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        // your code here
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i : a) {
            priorityQueue.add(i);    
        }
        
        for(int i : b) {
            priorityQueue.add(i);    
        }
        
        int[] result = new int[m + n];
        
        int index = 0;
        while(!priorityQueue.isEmpty()) {
            result[index] = priorityQueue.poll();
            index++;
        }
        
        return result;
    }
}
