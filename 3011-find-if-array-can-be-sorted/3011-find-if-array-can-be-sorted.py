class Solution:
    def canSortArray(self, nums: list[int]) -> bool:
        n = len(nums)
        
        for i in range(n):
            for j in range(n - 1 - i):
                if nums[j] > nums[j + 1]:
                    if nums[j].bit_count() == nums[j + 1].bit_count():
                        nums[j], nums[j + 1] = nums[j + 1], nums[j]
                    else:
                        return False
                        
        return True