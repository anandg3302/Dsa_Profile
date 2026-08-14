class Solution {
    public int numJewelsInStones(String jewels, String stones)
    {
        Set<Character> jewelsSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelsSet.add(jewel);
        }

        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelsSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}