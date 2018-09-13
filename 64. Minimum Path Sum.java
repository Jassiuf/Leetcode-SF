class Solution {
    
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        
         for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // starting
                if(r == 0 && c == 0) continue;
                //first row
                else if (r == 0) grid[r][c] += grid[r][c-1];
                
                //first col
                else if (c == 0)  grid[r][c] += grid[r-1][c];
                
                //otherwise
                else grid[r][c] += Math.min(grid[r-1][c], grid[r][c-1]);
            }
        }        
        
        
        return grid[m - 1][n- 1];
    }
}