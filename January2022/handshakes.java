/*
We have N persons sitting on a round table. Any person can do a handshake with any other person.

     1
2         3
     4

Handshake with 2-3 and 1-4 will cause cross.

In how many ways these N people can make handshakes so that no two handshakes cross each other. N would be even. 

Link: https://practice.geeksforgeeks.org/problems/handshakes1303/1
*/

/*
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution{
    static HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
    
    static int count(int n) { 
        // code here
        if(hashmap.containsKey(n)) {
            return hashmap.get(n);
        }
        
        if(n % 2 == 1) {
            return 0;
        }
        
        if(n == 0) {
            return 1;
        }
        
        int sum = 0;
        
        for(int i = 0 ; i < n ; i+= 2) {
            sum += count(i) * count(n - i - 2);
        }
        
        hashmap.put(n,sum);
        
        return sum;
    }
};
