/*
Given a list of coins of distinct denominations and total amount of money. Find the minimum number of coins required to make up that amount. Output -1 
if that money cannot be made up using given coins.You may assume that there are infinite numbers of coins of each type.
 
Link: https://practice.geeksforgeeks.org/problems/min-coin5549/1
*/

class Solution
{
    public int MinCoin(int[] nums, int amount)
    {
        // Code here
        if(amount == 0) {
            return 0;
        }
        
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        
        for(int i = 1 ; i <= amount ; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        

        for(int i = 1 ; i <= amount ; i++) {
            for(int j = 0 ; j < nums.length ; j++) {
                if(i >= nums[j]) {
                    int subAmount = dp[i - nums[j]];
                    if(subAmount != Integer.MAX_VALUE && subAmount + 1 < dp[i]) {
                        dp[i] = subAmount + 1;    
                    }
                }
            }
        }
        
        int result = dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount]; 
        return result;
    }
}

/*
Time Complexity: O(n*amount)
Space Complexity: O(amount)
*/
