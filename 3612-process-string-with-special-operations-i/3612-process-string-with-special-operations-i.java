class Solution {
    public String processStr(String s) {
     StringBuilder sb = new StringBuilder();
     for(int i = 0;i<s.length();i++){
        if(Character.isLowerCase(s.charAt(i))){
            sb.append(s.charAt(i));
        }
        else if(s.charAt(i) == '#'){
            String sg = sb.toString();
            sb.append(sg);
        }
        else if(s.charAt(i) == '%'){
            sb.reverse();
        }
        else if(s.charAt(i) == '*'){
            if(sb.length() > 0){
            sb.deleteCharAt(sb.length() - 1);
            }
        }
        else if(sb.length() == 0){
            return "";
        }
     }
     return sb.toString();   
    }
}