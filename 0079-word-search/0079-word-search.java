class Solution {
    public boolean exist(char[][] board, String word) {
        int m  = board.length;
        int n = board[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
             char a = board[i][j];
             if(word.contains(a+"")){
            StringBuilder sb = new StringBuilder();
              if(backtrack(i,j,sb,board,word)){
                return true;
              }
             }
            }
        }
        return false;
    }
boolean backtrack(int i,int j,StringBuilder sb,char[][] board,String word){
    char b = board[i][j];
    if (word.indexOf(sb.toString() + b) != 0) {
        return false;
    }
    
    board[i][j] = '#'; 
    sb.append(b);
    
    if(sb.length() == word.length()){
        board[i][j] = b;
        sb.deleteCharAt(sb.length() - 1);
        return true;
    }
    if(i+1 < board.length){
        if(backtrack(i+1,j,sb,board,word)) return true;
    }
    if(j+1 < board[0].length){
        if(backtrack(i,j+1,sb,board,word)) return true;
    }
    if(j-1 >= 0){
        if(backtrack(i,j-1,sb,board,word)) return true;
    }
    if(i-1 >= 0){
       if(backtrack(i-1,j,sb,board,word)) return true;
    }
    sb.deleteCharAt(sb.length() - 1);
    board[i][j] = b;
    return false;
}

}