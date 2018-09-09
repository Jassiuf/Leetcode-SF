
//Two pass solution

class Solution {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) return;
         transpose(matrix);
        for (int[] row : matrix) {
            reverse(row);
        }
    }
    
    public void transpose(int[][] matrix) {
        System.out.print(Arrays.deepToString(matrix));
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                if (row != col) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }
        }
    }
    
    public void reverse(int[] row) {
        int lo = 0, hi = row.length - 1;
        while (lo < hi) {
            int temp = row[lo];
            row[lo] = row[hi];
            row[hi] = temp;
            lo++; 
            hi--;
        }
    }
}