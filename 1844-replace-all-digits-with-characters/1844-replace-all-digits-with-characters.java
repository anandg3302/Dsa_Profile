class Solution {
    public String replaceDigits(String s) {
        int ascii = 0;
        StringBuilder sb = new StringBuilder();
        char ab = ' ';
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
                ab = ch;
            }
            else if(Character.isDigit(ch)){
                int a = ch - '0';
                int b = a + ab;
                char c = (char) (b);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}