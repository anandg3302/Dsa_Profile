import java.util.*;

class Solution {

    private boolean containsAll(HashMap<Character,Integer> need,HashMap<Character,Integer> window) {

        for(char ch : need.keySet()) {

            if(window.getOrDefault(ch, 0) < need.get(ch)) {
                return false;
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map1.put(ch,map1.getOrDefault(ch, 0) + 1);

            while(containsAll(map, map1)) {

                int length = right - left + 1;

                if(length < minLength) {
                    minLength = length;
                    start = left;
                }

                char remove = s.charAt(left);

                map1.put(remove,map1.get(remove) - 1);

                if(map1.get(remove) == 0) {
                    map1.remove(remove);
                }

                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}