class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String wd : patterns){
          if(word.contains(wd)){
            count++;
          }
        }
        return count;
    }
}