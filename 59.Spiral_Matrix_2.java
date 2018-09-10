class Solution {
    
    public int[][] generateMatrix(int n) {
        int i = 1;
        int[][] res = new int[n][n];
        int rowStart = 0, rowEnd = n -1, colStart = 0, colEnd = n - 1;
        
        while (rowStart <= rowEnd && colStart <= colEnd) {
            //right  = travese rowBegin
            for (int y = colStart; y <= colEnd; y++) {
                res[rowStart][y] = i++;
            }
            rowStart++;
            //down = traverse colEnd
            for (int x = rowStart; x <= rowEnd; x++) {
                res[x][colEnd] = i++;
            }
            colEnd--;
            //left = traverse rowEnd
            if (rowStart <= rowEnd) {
                for (int y = colEnd; y >= colStart; y--) {
                    res[rowEnd][y] = i++;
                }
            }
            rowEnd--;            
            //up
            if(colStart <= colEnd) {
                for (int x = rowEnd; x >= rowStart; x--) {
                    res[x][colStart] = i++;
                }
            }
            colStart++;
        }
        return res;
    }
}