class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> lis = new ArrayList<>();

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (top <= bottom && left <= right) {

            // top row
            for (int j = left; j <= right; j++) {
                lis.add(matrix[top][j]);
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                lis.add(matrix[i][right]);
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    lis.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    lis.add(matrix[i][left]);
                }
                left++;
            }
        }

        return lis;
    }
}