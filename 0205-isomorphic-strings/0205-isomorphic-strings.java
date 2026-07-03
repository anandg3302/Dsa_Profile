class Solution {
    public boolean isIsomorphic(String s1, String s2) {
    if (s1.length() != s2.length())
			return false;
		HashMap<Character, Character> map = new HashMap<>();
		HashMap<Character, Character> map1 = new HashMap<>();
		for (int i = 0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			char ch1 = s2.charAt(i);
			if (map.containsKey(ch)) {
				if (map.get(ch) != ch1) {
					return false;
				}
			}
			if (map1.containsKey(ch1)) {
				if (map1.get(ch1) != ch) {
					return false;
				}
			}
			map.put(ch, ch1);
			map1.put(ch1, ch);
		}
		return true;    
    }
}