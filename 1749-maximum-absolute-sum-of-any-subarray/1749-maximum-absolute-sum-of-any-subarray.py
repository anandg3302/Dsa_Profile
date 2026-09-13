class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        max_sum = 0
        min_sum = 0
        curr_max = 0
        curr_min = 0
        
        for num in nums:
            curr_max += num
            max_sum = max(max_sum, curr_max)
            if curr_max < 0:
                curr_max = 0
                
            curr_min += num
            min_sum = min(min_sum, curr_min)
            if curr_min > 0:
                curr_min = 0
                
        return max(max_sum, abs(min_sum))