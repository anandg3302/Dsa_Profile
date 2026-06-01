class Solution {
    public int sumFourDivisors(int[] nums) {
        int max_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max_sum += sumfour(nums[i]);
        }

        return max_sum;
    }

    public int sumfour(int n) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int other = n / i;

                if (i == other) {
                    count++;
                    sum += i;
                } else {
                    count += 2;
                    sum += i + other;
                }

                if (count > 4) {
                    return 0;
                }
            }
        }

        return count == 4 ? sum : 0;
    }
}