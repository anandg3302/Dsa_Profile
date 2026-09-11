class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        Set<Integer> ans = new HashSet<>();

        backtrack(digits, used, 0, 0, ans);

        return ans.size();
    }

    public void backtrack(int[] digits, boolean[] used, int length, int num, Set<Integer> ans) {

        if (length == 3) {
            ans.add(num);
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) {
                continue;
            }
            if (length == 0 && digits[i] == 0) {
                continue;
            }
            if (length == 2 && digits[i] % 2 != 0) {
                continue;
            }

            used[i] = true;

            backtrack(digits, used, length + 1,num * 10 + digits[i],ans);

            used[i] = false;
        }
    }
}