class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int Max_profit = 0;
        int profit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
            if (prices[i] > min_price) {
                profit = prices[i] - min_price;
                Max_profit = Math.max(Max_profit, profit);
            }
        }
        return Max_profit;
    }
}