class Solution {
    public int uniquePaths(int m, int n) {
      int[][] mat = new int[m][n];
      for(int i = 0;i<mat.length;i++){
        for(int j = 0;j<mat[0].length;j++){
            if(j == 0 || i == 0){
                mat[i][j] = 1;
            }
        }
      }

      for(int i = 1;i<mat.length;i++){
        for(int j = 1;j<mat[0].length;j++){
            mat[i][j] = mat[i-1][j] + mat[i][j-1];
        }
      }
      int a = mat[mat.length-1][mat[0].length-1];
      return a;
    }
}