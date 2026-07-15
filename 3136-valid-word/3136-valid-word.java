class Solution {
    public boolean isValid(String word) {
        boolean vowel = false;
        boolean cons  = false;
        if (word.length() >= 3) {
            for (int i = 0; i < word.length(); i++) {
               if(!Character.isLetterOrDigit(word.charAt(i))) return false;
               if(Character.isDigit(word.charAt(i))){
               }
               if(Character.isLetter(word.charAt(i))){
                    char ch = word.charAt(i);
                    if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U'){
                        vowel = true;
                    }
               }
               if(Character.isLetter(word.charAt(i))){
                    char ch = word.charAt(i);
                    if( ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'&& ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'&& ch != 'U'){
                        cons = true;
                    }
               }

            }
        }
        return vowel && cons;
    }
}
