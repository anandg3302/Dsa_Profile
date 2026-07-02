import java.util.ArrayList;
import java.util.List;

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int choice = rodLinear(0,nums.length-2,nums);
        int choice1 = rodLinear(1,nums.length-1,nums);
        return Math.max(choice,choice1); 
    }
    
    int rodLinear(int i,int j,int[] nums){
        int length = j - i + 1;
        if(length == 1) return nums[i];
        if(length == 2) return Math.max(nums[i],nums[j]);
        
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[i]);
        ans.add(Math.max(nums[i],nums[i+1]));
        for(int k = i + 2; k <= j; k++){
            int rob = nums[k] + ans.get(ans.size() - 2);
            int skip = ans.get(ans.size() - 1);
            ans.add(Math.max(rob,skip)); 
        }
        return ans.get(ans.size() - 1);
    }
}
