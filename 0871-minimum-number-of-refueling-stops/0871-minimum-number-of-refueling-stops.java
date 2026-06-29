import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        if(stations.length == 0) {
            if (startFuel >= target) return 0;
            else return -1;
        }
        int fuel = startFuel;
        int count = 0;
        if (fuel >= stations[0][0]) {
            pq.offer(stations[0][1]); 
            fuel = fuel - stations[0][0];
            target -= stations[0][0];
        } else {
            return -1;
        }
        for (int i = 1; i < stations.length; i++) {
            int diff = stations[i][0] - stations[i - 1][0];
            
            while (fuel < diff) {
                if (pq.isEmpty()) return -1;
                fuel += pq.poll();
                count++;
            }

            if (fuel > diff) {
                fuel = fuel - diff;
                target -= diff;
                pq.offer(stations[i][1]);
            } else if (fuel == diff) {
                fuel = 0;
                target -= diff;
                pq.offer(stations[i][1]);
            }
        }

        while (fuel < target) {
            if (pq.isEmpty()) return -1;
            fuel += pq.poll();
            count++;
        }

        return count;
    }
}
