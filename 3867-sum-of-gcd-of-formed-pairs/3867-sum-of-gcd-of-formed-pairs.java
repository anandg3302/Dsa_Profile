class Solution {
    long sum = 0;
    public long gcdSum(int[] nums) {
        sum = 0; 
        List<Long> ans = new ArrayList<>();
        long max = Integer.MIN_VALUE;
        
        for(long num : nums){
            if(num > max){
                max = num;
            }
            
            long n = gcd(num, max);
            ans.add(n);
        }
        
       Collections.sort(ans);
       
       int left = 0; 
       int right = ans.size() - 1;
       while(left < right){
          long a = gcd(ans.get(left), ans.get(right));
          sum += a;
          left++;
          right--;
       }
       
       return sum;
    }

    public long gcd(long n, long m){
        while (m != 0) {
            long temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
}
