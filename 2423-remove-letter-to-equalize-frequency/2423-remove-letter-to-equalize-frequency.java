class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : word.toCharArray()) {
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
            if (check(map)) {
                return true;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return false;
    }

    public boolean check(HashMap<Character, Integer> map) {
        int freq = -1;

        for (int val : map.values()) {
            if (freq == -1) {
                freq = val;
            } else if (freq != val) {
                return false;
            }
        }

        return true;
    }
}