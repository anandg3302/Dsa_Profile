class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b) -> Integer.compare(a[0]-a[1],b[0]-b[1]));
        int  n = costs.length/2;
        int max_cost = 0;
        for(int i = 0;i< costs.length;i++){
            if(i < n){
                max_cost += costs[i][0]; 
            }
            else{
                max_cost += costs[i][1];
            }
        }
        return max_cost;
    }
}