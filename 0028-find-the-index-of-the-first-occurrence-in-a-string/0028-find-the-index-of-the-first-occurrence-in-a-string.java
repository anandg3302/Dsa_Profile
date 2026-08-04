class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0) return 0;

        String need = needle;
        String nee = haystack;

        for (int i = 0; i <= nee.length() - need.length(); i++) {
            String k = nee.substring(i, i + need.length());
            if (k.equals(need)) {
                return i;
            }
        }
        return -1;
    }
}
