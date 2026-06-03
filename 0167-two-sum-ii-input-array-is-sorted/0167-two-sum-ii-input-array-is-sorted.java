public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;  
        int end = numbers.length - 1;  
         while (start < end) {
            // Calculate the sum of the values at the two pointers
            int sum = numbers[start] + numbers[end];
            
            // Check if the calculated sum matches the target
            if (sum == target) {
                return new int[] {start + 1, end + 1};
            }
            // If the sum is less than the target, move the start pointer right to increase the sum
            if (sum < target) {
                start++;
            } 
            // If the sum is greater than the target, move the end pointer left to decrease the sum
            else {
                end--;
            }
        }
        throw new IllegalArgumentException("No valid pair found for the given target");
    }
}
