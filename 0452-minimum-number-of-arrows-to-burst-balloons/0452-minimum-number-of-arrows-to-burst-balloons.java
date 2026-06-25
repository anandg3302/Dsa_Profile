class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)-> Integer.compare(a[1],b[1]));
        int end1 = points[0][1];
        int count = 1;
        int n = points.length;
        for(int i = 1;i<n;i++){
          int start = points[i][0];
          int end = points[i][1];
          if(start <= end1 && end1 <= end){
            continue;
          }
          else{
            count++;
            end1 =points[i][1];

          }
        }
        return count;
    }
}