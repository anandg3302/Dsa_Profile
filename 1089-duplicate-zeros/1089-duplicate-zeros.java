class Solution {
    public void duplicateZeros(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                ans.add(arr[i]);
            } else {
                if (ans.size() < arr.length) {
                    ans.add(0);
                }

                if (ans.size() < arr.length) {
                    ans.add(0);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
    }
}