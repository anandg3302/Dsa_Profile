class Solution:
    def majorityElement(self, nums: List[int]) -> int:
     mp = {}
     for num in nums:
        mp[num] = mp.get(num,0) + 1
    
     maj = 0
     maj_ele = 0
     for key in mp:
        n = mp[key]
        if n > maj:
            maj = n
            maj_ele = key
     return maj_ele