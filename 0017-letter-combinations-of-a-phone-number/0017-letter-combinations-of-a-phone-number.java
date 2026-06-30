class Solution {
    public List<String> letterCombinations(String digits) {
    ArrayList<String> ans = new ArrayList<>();
    if(digits == null || digits.length() == 0){
        return ans;
    }
    HashMap<Character,String > map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

    Backtrack(0,digits,map,new StringBuilder(),ans);
    return ans;
    }

    void Backtrack(int idx, String digits,HashMap<Character,String> map,StringBuilder current,List<String> ans){
        if(idx == digits.length()){
            ans.add(current.toString());
            return;
        }
        char ab = digits.charAt(idx);
        String letter = map.get(ab);
        for(int i = 0;i<letter.length();i++){
            current.append(letter.charAt(i));
            Backtrack(idx+1,digits,map,current,ans);
            current.deleteCharAt(current.length()-1);
        }
    }
}