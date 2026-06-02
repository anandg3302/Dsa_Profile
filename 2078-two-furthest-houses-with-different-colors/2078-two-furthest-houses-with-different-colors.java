class Solution {
    public int maxDistance(int[] colors) {
      int max = 0;
      int n = colors.length;
      int ans = 0;
      for(int j = n-1; j>=0;j--){
        if(colors[0] != colors[j]){
            ans = j;
            break;
        }
      }
      for(int i = 0;i<colors.length;i++){
        if(colors[i] != colors[n-1])
        {
            ans= Math.max(ans,n-1-i);
        }
        
      }
      return ans;
    }
}