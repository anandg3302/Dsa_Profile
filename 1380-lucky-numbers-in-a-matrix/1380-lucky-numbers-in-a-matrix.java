class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (lucky(i, j, matrix)) {
                    ans.add(matrix[i][j]);
                }
            }
        }

        return ans;
    }

    public static boolean lucky(int row, int col, int[][] matrix) {

        int n = matrix[row][col];
        for (int j = 0; j < matrix[0].length; j++) {
            if (n > matrix[row][j]) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if (n < matrix[i][col]) {
                return false;
            }
        }

        return true;
    }
}