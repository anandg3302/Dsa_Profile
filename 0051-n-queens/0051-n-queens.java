import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        // Fix: Use List<List<String>> to match LeetCode's return type requirement
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize the board with empty spots '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        // Start backtracking from Row 0
        backtrack(0, board, ans, n);
        return ans;
    }

    // Fix: Explicitly declare the type of each parameter
    void backtrack(int row, char[][] board, List<List<String>> ans, int n) {
        // Base Case: If we placed queens in all rows, construct the string board and save it
        if (row == n) {
            ans.add(construct(board));
            return;
        }

        // Loop through all columns in the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';             // Choose: Place Queen
                backtrack(row + 1, board, ans, n); // Explore: Go to next row
                board[row][col] = '.';             // Unchoose: Remove Queen (Backtrack)
            }
        }
    }

    // Fix: Changed return type from void to boolean because it returns true/false
    boolean isSafe(int row, int col, char[][] board, int n) {
        // 1. Check straight up in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 2. Check top-left diagonal (Row decreases, Column decreases)
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 3. Check top-right diagonal (Row decreases, Column increases)
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; // Safe to place a queen here!
    }

    // Helper method to convert the 2D char array row into a list of Strings for LeetCode
    private List<String> construct(char[][] board) {
        List<String> path = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            path.add(new String(board[i]));
        }
        return path;
    }
}
