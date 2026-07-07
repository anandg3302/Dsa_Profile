import java.util.*;

class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        backtrack(0, board, n);
        return count;
    }

    private void backtrack(int row, char[][] board, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';     
                backtrack(row + 1, board, n); 
                board[row][col] = '.';   
            }
        }
    }

    private boolean isSafe(int row, int col, char[][] board, int n) {
        // 1. Check straight up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // 2. Check top-left diagonal 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // 3. Check top-right diagonal 
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true; 
    }
}
