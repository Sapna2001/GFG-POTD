/*
Given a NxM binary matrix consisting of 0s and 1s. Find if there exists a rectangle/ square within the matrix whose all four corners are 1. 

Link: https://practice.geeksforgeeks.org/problems/253524a82f7b4561dc33ff637cd3b92c33d4f216/1
*/

public class Solution { 
	static boolean ValidCorner(int matrix[][]) 
	{ 
	    // Your code goes here
	    int rows = matrix.length, columns = matrix[0].length;
	    HashMap<Integer, HashSet<Integer>> table = new HashMap<>();
	    
	    for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1; j++) {
                for (int k = j + 1; k < columns; k++) {
                    if (matrix[i][j] == 1 && matrix[i][k] == 1) {
                        if (table.containsKey(j) && table.get(j).contains(k) || 
                            table.containsKey(k) && table.get(k).contains(j)) {
                            return true;
                        }
                        
                        if (!table.containsKey(j)) {
                            HashSet<Integer> hashset = new HashSet<>();
                            hashset.add(k);
                            table.put(j, hashset);
                        } else {
                            table.get(j).add(k);
                        }
                        
                        if (!table.containsKey(k)) {
                            HashSet<Integer> hashset = new HashSet<>();
                            hashset.add(j);
                            table.put(k, hashset);
                        } else {
                            table.get(k).add(j);
                        }
                    }
                }
            }
	    }
	    
	    return false;
	}
}

/*
Time complexity: O(row * col * col)
*/
