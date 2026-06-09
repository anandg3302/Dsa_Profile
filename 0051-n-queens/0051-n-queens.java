import java.util.*;

class Solution {

    List<List<String>> result = new ArrayList<>();
    Set<Integer> col = new HashSet<>();
    Set<Integer> diag = new HashSet<>();
    Set<Integer> antidiag = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] board  = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        backtrack(0, n, board);
        return result;
    }

    public void backtrack(int row, int n, char[][] board){
        //  Base case 
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(char[] ch : board){
                temp.add(new String(ch));
            }
            result.add(temp);
            return; 
        }

        for(int cols = 0; cols < n; cols++){
            if(col.contains(cols) || diag.contains(cols - row) || antidiag.contains(cols + row)){
                continue;
            }

            // placing queen
            board[row][cols] = 'Q';
            col.add(cols);
            diag.add(cols - row);
            antidiag.add(cols + row);
            // recurse
            backtrack(row + 1, n, board);

            // backtrack
            board[row][cols] = '.';
            col.remove(cols);
            diag.remove(cols - row);
            antidiag.remove(cols + row);
        }
    }
}

