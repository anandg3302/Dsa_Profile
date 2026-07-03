import java.util.Arrays;

class Solution {
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo, -1); // -1 means unvisited
        return backtrack(0, s, memo);
    }

    int backtrack(int i, String s, int[] memo) {
        if (i == s.length()) return 1;
        if (s.charAt(i) == '0') return 0;

        // If we already know how many ways to decode from this index, load it!
        if (memo[i] != -1) {
            return memo[i];
        }

        int takeOne = backtrack(i + 1, s, memo);
        
        int takeTwo = 0;
        if (i + 1 < s.length()) {
            int twoDigitValue = Integer.parseInt(s.substring(i, i + 2));
            if (twoDigitValue >= 10 && twoDigitValue <= 26) {
                takeTwo = backtrack(i + 2, s, memo);
            }
        }

        // Save to notepad before returning
        memo[i] = takeOne + takeTwo;
        return memo[i];
    }
}
