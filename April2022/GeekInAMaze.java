/*
Geek is in a maze of size N * M. Each cell in the maze is made of either '.' or '#'. An empty cell is represented by '.' and an obstacle is represented by 
'#'. If Geek starts at cell (R, C), find how many different empty cells he can pass through while avoiding the obstacles. He can move in any of the four 
directions but he can move up at most U times and he can move down atmost D times.

Link: https://practice.geeksforgeeks.org/problems/b5e2a639b39537ea71e4551a4274383bda1c9a34/1
*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    private static boolean checkBounds(int i, int j, int r, int c){
        return (i >= 0 && i < r && j >= 0 && j < c);
    }
    
    private static boolean invalidState(int x, int y, int i, int j, int up, int down){
        if(x < i){
            return up == 0;
        }
        else if(x > i){
            return down == 0;
        }
        else{
            return false;
        }
    }

	public static int numberOfCells(int n, int m, int r, int c, int u, int d, char mat[][]) {
		// code here
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		
		if(mat[r][c] == '#') {
		    return 0;
		}
		
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{r, c, u, d});
		
		boolean[][] visited = new boolean[n][m];
		visited[r][c] = true;
		int count = 0;
		
		while(!queue.isEmpty()){
		    int size = queue.size();
		    while(size-- > 0){
		        
		        int[] current = queue.poll();
		        int i = current[0];
		        int j = current[1];

		        int up = current[2];
		        int down = current[3];
		        count++;
		        
		        for(int k = 0; k < 4; k++){
		            int x = i + dx[k];
		            int y = j + dy[k];
		            
		            if(checkBounds(x, y, n, m) && !visited[x][y] && mat[x][y] == '.'){
		                if(invalidState(x, y, i, j, up, down)){
		                    continue;
		                }
		                
		                else{
		                    visited[x][y] = true;
		                    if(x < i){
		                      queue.offer(new int[]{x, y, up - 1, down});  
		                    }
		                    else if(x > i){
		                      queue.offer(new int[]{x, y, up, down - 1});  
		                    }
		                    else{
		                        queue.offer(new int[]{x, y, up, down});
		                    }    
		                }
		            }
		        }
		    }
		}
		
		return count;
	}

}


// { Driver Code Starts.

public class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int r = sc.nextInt();
		    int c = sc.nextInt();
		    int u = sc.nextInt();
		    int d = sc.nextInt();
		    
		    char mat[][] = new char[n][m];

            for(int i = 0; i < n; i++)
            {
                String s = sc.next();
                for(int j = 0; j < m; j++)
                {
                    mat[i][j] = s.charAt(j);
                }
            }
            
            Solution obj = new Solution();
            System.out.println(obj.numberOfCells(n, m, r, c, u, d, mat));
		    
		}
	}
}

  // } Driver Code Ends
