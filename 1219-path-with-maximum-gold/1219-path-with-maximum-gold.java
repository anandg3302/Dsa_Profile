class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    maxGold = Math.max(maxGold, backtrack(i, j, grid, m, n));
                }
            }
        }
        return maxGold;
    }

    int backtrack(int i, int j, int[][] grid, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        int currentGold = grid[i][j];
        grid[i][j] = 0;

        int maxFromNeighbors = 0;

        maxFromNeighbors = Math.max(maxFromNeighbors, backtrack(i, j - 1, grid, m, n));
        maxFromNeighbors = Math.max(maxFromNeighbors, backtrack(i + 1, j, grid, m, n));
        maxFromNeighbors = Math.max(maxFromNeighbors, backtrack(i - 1, j, grid, m, n));
        maxFromNeighbors = Math.max(maxFromNeighbors, backtrack(i, j + 1, grid, m, n));

        grid[i][j] = currentGold;

        return currentGold + maxFromNeighbors;
    }
}
