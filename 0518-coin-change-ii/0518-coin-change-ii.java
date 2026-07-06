class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        int a = 0;
        a += coinChange(amount, coins, 0, dp);
        return a;

    }

    int coinChange(int amount, int[] coins, int i, int[][] dp) {
        if (amount == 0)
            return 1;
        if (amount < 0)
            return 0;
        if (i >= coins.length)
            return 0;
        if (dp[i][amount] != -1)
            return dp[i][amount];
        int take = coinChange(amount - coins[i], coins, i, dp);
        int notTake = coinChange(amount, coins, i + 1, dp);
        dp[i][amount] = take + notTake;
        return dp[i][amount];
    }
}