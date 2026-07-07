class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        
        String s = String.valueOf(n);
        for (char ch : s.toCharArray()) {
            int a = ch - '0';
            if (a != 0) {
                sum += a;          
                x = x * 10 + a;    
            }
        }
        
        return x * sum; 
    }
}
