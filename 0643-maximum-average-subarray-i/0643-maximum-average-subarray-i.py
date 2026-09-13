class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        if len(nums) == 1:
            return nums[0]
        if len(nums) == 0:
            return 0
        sum = 0
        avg = 0
        for i in range(0,k):
            sum += nums[i]

        avg = sum / k
        i = k
        max_avg = avg
        for i in range(k,len(nums)):
            sum -= nums[i-k]
            sum += nums[i]
            avg = sum / k
            max_avg = max(avg,max_avg)
            
        return max_avg

        