class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= searchWord.length()) {
                String prefix = word.substring(0, searchWord.length());
                if (prefix.equals(searchWord)) {
                    return i + 1;
                }
            }

        }
        return -1;
    }
}