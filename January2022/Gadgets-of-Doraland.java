/*
In Doraland, people have unique Identity Numbers called D-id. Doraemon owns the most popular gadget shop in Doraland. Since his gadgets are in high demand and he 
has only K gadgets left he has decided to sell his gadgets to his most frequent customers only. N customers visit his shop and D-id of each customer is given in 
an array array[ ]. In case two or more people have visited his shop the same number of time he gives priority to the customer with higher D-id. Find the D-ids of people he sells his K gadgets to.

Link: https://practice.geeksforgeeks.org/problems/bbd15e2da95880979ce65acc7360e2c5681664e65520/1
*/


/*
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i=0; i<n; i++)
                        {
                            int x = sc.nextInt();
                            arr.add(x);
                        }
                    int k = sc.nextInt();
                    
                    Solution obj = new Solution();
                    res = obj.TopK(arr,k);
                    
                    for(int i=0; i<res.size();i++)
                        {
                            System.out.print(res.get(i) + " ");
                        }
                    System.out.println();    
                    
                        
                }
        }
}// } Driver Code Ends


class Solution
{
    static class Pair {
        int key, value;
        
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    static class MIN implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            if(a.value > b.value) {
                return -1;
            } else if(b.value > a.value) {
                return 1;
            } else {
                if(a.key > b.key) {
                    return -1;
                } else if(b.key > a.key) {
                    return 1;
                } else {
                    return 0;
                }    
            }
        }    
    }
    
    ArrayList<Integer>TopK(ArrayList<Integer> array, int k)
    {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i : array) {
            hashMap.putIfAbsent(i, 0);
            int currentCount = hashMap.get(i) + 1;
            hashMap.put(i, currentCount);
        }
        
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new MIN());
        
        for(Map.Entry map : hashMap.entrySet()) {
            int key = (int)map.getKey();
            int count = (int)map.getValue();
            priorityQueue.add(new Pair(key, count));
        }
        
        for(int i = 0 ; i < k ; i++) {
            result.add(priorityQueue.poll().key);
        }
        
        return result;
    }
}
