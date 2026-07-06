class Solution {

    public int uniquePathsIII(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int startRow = 0;
        int startCol = 0;
        int remaining = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] != -1) {
                    remaining++;
                }

                if (grid[i][j] == 1) {
                    startRow = i;
                    startCol = j;
                }
            }
        }

        return backtrack(startRow, startCol, remaining, grid);
    }

    int backtrack(int i, int j, int remaining, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        if (grid[i][j] == 2) {
            return remaining == 1 ? 1 : 0;
        }
        int temp = grid[i][j];
        grid[i][j] = -1;

        int paths = 0;

        paths += backtrack(i + 1, j, remaining - 1, grid);
        paths += backtrack(i - 1, j, remaining - 1, grid);
        paths += backtrack(i, j + 1, remaining - 1, grid);
        paths += backtrack(i, j - 1, remaining - 1, grid);
        grid[i][j] = temp;

        return paths;
    }
}