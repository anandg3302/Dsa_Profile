class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        min_size = float('inf')
        size  = 0
        sum = 0
        left = 0
        for i in range (0,len(nums)):
            sum += nums[i]   
            while sum >= target: 
                size = (i - left) + 1
                min_size = min(size,min_size)
                sum -= nums[left]
                left += 1

        return min_size if min_size != float('inf') else 0
        