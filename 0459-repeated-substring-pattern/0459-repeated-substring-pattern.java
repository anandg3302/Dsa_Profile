class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length() == 1) return false;
        char[] arr = s.toCharArray(); 
        char ch = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == ch){
                int len = i - 1;
                String part = s.substring(0, len + 1); 
                if (part.length() > 0 && s.length() % part.length() == 0) {
                    StringBuilder sb = new StringBuilder(s);
                    int idx = sb.indexOf(part);
                    while(idx != -1){
                        sb.delete(idx, idx + part.length());
                        idx = sb.indexOf(part);
                    }
                    if (sb.length() == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
