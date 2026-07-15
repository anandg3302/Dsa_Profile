class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum = 0;
        int sum1 = 0;
        int originalN = n;
        int n1 = n;
        
        int a = 1;
        while (n > 0) {
            if (a % 2 != 0) {
                sum1 += a;
                n = n - 1;
            }
            a++;
        }
        
        a = 1;
        while (n1 > 0) {
            if (a % 2 == 0) {
                sum += a;
                n1 = n1 - 1;
            }
            a++;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= sum && i <= sum1; i++) {
            if (sum % i == 0 && sum1 % i == 0) {
                max = i;
            }
        }
        return max;
    }
}
