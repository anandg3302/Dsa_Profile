class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
       int m = obstacleGrid.length;
       int n = obstacleGrid[0].length;
       int[][] mat = new int[m][n];
       if(obstacleGrid[0][0] == 1) return 0;
      for(int j = 0;j<n;j++){
        if(obstacleGrid[0][j] == 1){
            break;
        }
        mat[0][j] = 1;
      }

      for(int i = 0;i< m;i++){
        if(obstacleGrid[i][0] == 1){
            break;
        }
        mat[i][0] = 1;
      }

      for(int i = 1;i<mat.length;i++){
        for(int j = 1;j<mat[0].length;j++){
           if (obstacleGrid[i][j] == 1) {
                    mat[i][j] = 0;
           }
            else{
            mat[i][j] = mat[i-1][j] + mat[i][j-1];
            }
        }
      }
      int a = mat[mat.length-1][mat[0].length-1];
      return a;   
    }
}