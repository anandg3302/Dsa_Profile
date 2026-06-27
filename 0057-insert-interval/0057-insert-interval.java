import java.util.ArrayList;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int i = 0;
        
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }
        
        while (i < n && intervals[i][0] <= newInterval[1]) {
            int minStart = Math.min(intervals[i][0], newInterval[0]);
            int maxEnd = Math.max(intervals[i][1], newInterval[1]);
            newInterval[0] = minStart;
            newInterval[1] = maxEnd;
            i++;
        }
        ans.add(newInterval);
        
        while (i < n) {
              ans.add(intervals[i]);
              i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
