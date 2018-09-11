class Solution {
    
    // m is total rows, n is total cols
    public int uniquePaths(int m, int n) {
        return recursive( 0, 0, m, n, 0, new int[m][n]);
    }
    
    public int recursive( int r, int c, int m, int n, int count, int[][] visited) {
        if (r == m - 1 && c == n - 1)   return 1;       
        if (  r < m && c < n ) {
            if (visited[r][c] != 0) {
                return visited[r][c];
            } else {
                count += visited[r][c] = recursive(r + 1, c, m , n, count, visited) + recursive(r, c +1, m, n, count,visited);
            }            
        }
        return count;
    }

}