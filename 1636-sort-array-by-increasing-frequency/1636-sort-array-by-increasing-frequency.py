class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        mp = {}
        for i in range(len(nums)):
            mp[nums[i]] = mp.get(nums[i],0) + 1
        ans = []
        for i in range(len(nums)):
            ans.append([0,0])
        for i in range(len(nums)):
            ans[i][0] = nums[i]
            ans[i][1] =mp[nums[i]]
        ans.sort(key = lambda x : (x[1] ,-x[0]))
        
        for i in range(len(nums)):
            nums[i] = ans[i][0]
        return nums