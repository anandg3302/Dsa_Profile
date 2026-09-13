class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        max_len = 0
        count = 0  
        left = 0
        
        for i in range(len(nums)):
            if nums[i] == 0:
                count += 1
                
            while count > k:
                if nums[left] == 0:
                    count -= 1
                left += 1
                
            max_len = max(max_len, i - left + 1)
            
        return max_len