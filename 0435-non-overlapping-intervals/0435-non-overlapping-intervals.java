class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->Integer.compare(a[1],b[1]));
        int count = 1;
        int last = intervals[0][1];
        for(int i = 1;i< intervals.length;i++){
                 int n = intervals[i][0];
                 if(last <= n){
                    last = intervals[i][1];
                    count++;
                 }
        }
        int m = intervals.length;
        return m - count; 
    }
}