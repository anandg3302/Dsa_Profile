class Solution {

    int[][] dp;

    public int coinChange(int[] coins, int amount) {

        dp = new int[coins.length][amount + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans = backtrack(coins, amount, 0);

        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }

    int backtrack(int[] coins, int amount, int i) {

        if (amount == 0)
            return 0;

        if (amount < 0)
            return Integer.MAX_VALUE / 2;

        if (i == coins.length)
            return Integer.MAX_VALUE / 2;
        if (dp[i][amount] != -1)
            return dp[i][amount];

        int take = 1 + backtrack(coins, amount - coins[i], i);

        int skip = backtrack(coins, amount, i + 1);

        dp[i][amount] = Math.min(take, skip);

        return dp[i][amount];
    }
}