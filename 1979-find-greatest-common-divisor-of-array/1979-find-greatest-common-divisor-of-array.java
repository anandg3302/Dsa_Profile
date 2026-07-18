class Solution {
    public int findGCD(int[] nums) {
        int gcd = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        for(int i = 1; i<=min ;i++){
            if( max % i == 0 && min % i == 0){
                gcd = i;
            }
        }
        if(gcd != 0) return gcd;
        return -1;
    }
}