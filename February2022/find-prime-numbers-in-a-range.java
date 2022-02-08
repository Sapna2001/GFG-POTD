/*

Given two integers M and N, generate all primes between M and N.

Link: https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1#
*/

class Solution {
    private static boolean isPrime(int a) {
        boolean flag = true;
        for(int i = 2 ; i * i <= a ; i++) {
            if(a % i == 0) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    ArrayList<Integer> primeRange(int m, int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        if(m == 1) {
            m++;
            if(n >= 2) {
                result.add(m); 
                m++;
            }
        }
        
        if(m == 2) {
            result.add(m);  
        }
        
        if(m % 2 == 0) {
            m++;
        }
        
        for(int i = m ; i <= n ; i += 2) {
            if(isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
