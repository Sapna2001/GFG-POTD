/*
Given a grid of size n*m (n is number of rows and m is number of columns grid has) consisting of '0's(Water) and '1's(Land). Find the number of islands.
Note: An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

Link: https://practice.geeksforgeeks.org/problems/find-the-number-of-islands/1
*/

class Solution {
    // Function to find the number of islands.
    private static void dfs(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == '0') {
                return;
        }
        
        grid[x][y] = '0';
        dfs(grid, x + 1, y);
        dfs(grid, x, y + 1);
        dfs(grid, x - 1, y);
        dfs(grid, x, y - 1);
        dfs(grid, x + 1, y + 1);
        dfs(grid, x + 1, y - 1);
        dfs(grid, x - 1, y + 1);
        dfs(grid, x - 1, y - 1);
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int island = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    dfs(grid, i, j);
                }
            }
        }

        return island;
    }
}
