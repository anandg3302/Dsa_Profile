class Solution{
    public int jump(int[] nums){
        int target= nums.length - 1;
        int jump = 0;
        while(target > 0){
            for(int i = 0; i < target ;i++){
                if(i+nums[i] >= target){
                    target = i;
                    jump++;
                    break;
                }
            }
        }
        return jump;
    }
}